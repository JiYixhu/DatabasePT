package servlets;

import Util.Brand;
import Util.Category;
import Util.PageBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.BusinessService;

@WebServlet(name = "BusinessServlet", urlPatterns = {"/BusinessServlet"})
public class BusinessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("GB2312");
        response.setCharacterEncoding("GB2312");
        String flag = request.getParameter("flag");
        RequestDispatcher rd = null;
        BusinessService bs = new BusinessService();
        if (flag.equals("Searchlist")) {
            String page = request.getParameter("page");
            String cate = request.getParameter("selectcate");
            String brand = request.getParameter("selectbrand");
            String name = request.getParameter("selectname");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            Category category = bs.SearchCate();
            request.setAttribute("category", category);//!!!!
            Brand bbrand = bs.SearchBrand();
            request.setAttribute("bbrand", bbrand);//!!!!
            PageBean pageBean = bs.Searchlist(cate, brand, name, curPage);
            request.setAttribute("pageBean", pageBean);
            request.setAttribute("parameCate", cate);
            request.setAttribute("parameBrand", brand);
            rd = request.getRequestDispatcher("/business/first.jsp");
            rd.forward(request, response);
        } else if ("showHadetail".equals(flag)) {
            String id = request.getParameter("id");
            Map hardware = bs.getById(id);
            request.setAttribute("hardware", hardware);
            rd = request.getRequestDispatcher("/business/showHadetail.jsp");
            rd.forward(request, response);
        } else if ("Pricelist".equals(flag)) {
            String Name1 = request.getParameter("Name1");
            String Name2 = request.getParameter("Name2");
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = bs.Pricelist(Name1, Name2, curPage);//!!!!
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/business/second.jsp");
            rd.forward(request, response);
        } else if ("add".equals(flag)) {
            String addresult;
            String THaNo = request.getParameter("THaNo");
            String THaName = request.getParameter("THaName");
            String TBuNo = request.getParameter("TBuNo");
            String TBuName = request.getParameter("TBuName");
            String NowPrice = request.getParameter("TNowPrice");
            String TPwd = request.getParameter("TPwd");
            if ("".equals(THaNo) || "".equals(THaName) || "".equals(TBuNo) || "".equals(TBuName) || "".equals(NowPrice)||"".equals(TPwd)) {
                addresult = "isnull";
            } else if (bs.checkLogin2(TBuNo, TPwd)) {
                double TNowPrice = Double.parseDouble(NowPrice);
                request.getSession().setAttribute("PwdResult", "ok");
                Map paramters = new HashMap();
                paramters.put("THaNo", THaNo);
                paramters.put("THaName", THaName);
                paramters.put("TBuNo", TBuNo);
                paramters.put("TBuName", TBuName);
                paramters.put("TNowPrice", TNowPrice);
                int rl = bs.add(paramters);
                addresult = (rl > 0 ? "添加成功" : "添加失败");
            } else {
                addresult = "密码错误";
            }
            request.setAttribute("addresult", addresult);
            rd = request.getRequestDispatcher("/business/third.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
