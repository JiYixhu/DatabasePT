package servlets;

import Util.Brand;
import Util.Category;
import Util.PageBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.UserService;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
        UserService us = new UserService();
        if ("Halist".equals(flag)) {
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
            Category category = us.SearchCate();
            request.setAttribute("category", category);//!!!!
            Brand bbrand = us.SearchBrand();
            request.setAttribute("bbrand", bbrand);//!!!!
            PageBean pageBean = us.Searchlist(cate, brand, name, curPage);
            request.setAttribute("pageBean", pageBean);
            request.setAttribute("parameCate", cate);
            request.setAttribute("parameBrand", brand);
            rd = request.getRequestDispatcher("/user/first.jsp");
            rd.forward(request, response);
        } else if ("register".equals(flag)) {
            String username = request.getParameter("username");
            String pwd1 = request.getParameter("pwd1");
            String pwd2 = request.getParameter("pwd2");
            String tel = request.getParameter("tel");
            System.out.println("用户名为："+username);
            String result;
            if ("".equals(username)||"".equals(pwd1)||"".equals(pwd2)||"".equals(tel)){
                result="isnull";
            } else if(pwd1.equals(pwd2)) {
                Map paramters = new HashMap();
                paramters.put("username", username);
                paramters.put("pwd2", pwd2);
                paramters.put("tel", tel);
                int rl = us.register(paramters);
                result = (rl > 0 ? "yes" : "no");
            }
            else {
                result = "pwdwrong";
            }
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
        } else if ("showHadetail".equals(flag)) {
            String id = request.getParameter("id");
            Map file = us.getById(id);
            request.setAttribute("file", file);
            rd = request.getRequestDispatcher("/showHadetail.jsp");
            rd.forward(request, response);
        } 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
