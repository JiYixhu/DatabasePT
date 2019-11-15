package servlets;

import Util.Brand;
import Util.Category;
import Util.PageBean;
import java.io.IOException;
import java.io.PrintWriter;
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
            String cate = request.getParameter("cate");
            String brand = request.getParameter("brand");
            String name = request.getParameter("name");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            Category category =bs.SearchCate();
            request.setAttribute("category", category);//!!!!
            Brand bbrand =bs.SearchBrand();
            request.setAttribute("bbrand", bbrand);//!!!!
            PageBean pageBean = bs.Searchlist(cate,brand,name,curPage);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/business/first.jsp");
            rd.forward(request, response);      
        }
        else if ("showHadetail".equals(flag)) {
            String id = request.getParameter("id");
            Map hardware = bs.getById(id);
            request.setAttribute("hardware", hardware);
            rd = request.getRequestDispatcher("/business/showHadetail.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
