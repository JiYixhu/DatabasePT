package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AdminService;
import services.BusinessService;
import services.UserService;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        RequestDispatcher rd = null;
        if (username != null && password != null && role != null) {         
            if ("1".equals(role)) {
                AdminService as = new AdminService();
                    if (as.checkLogin(username, password)) {
                    request.getSession().setAttribute("loginResult","ok");
                    rd = request.getRequestDispatcher("AdminServlet?flag=Halist");
                    rd.forward(request, response);
                    return;
                }
            } 
            else if ("2".equals(role)) {
                BusinessService bs = new BusinessService();
                if (bs.checkLogin(username, password)) {
                    request.getSession().setAttribute("loginResult","ok");
                    rd = request.getRequestDispatcher("BusinessServlet?flag=Searchlist");
                    rd.forward(request, response);
                    return;
                }
            } 
            else if ("3".equals(role)) {
                UserService us=new UserService();
                if (us.checkLogin(username, password)) {
                    request.getSession().setAttribute("loginResult","ok");
                    rd = request.getRequestDispatcher("UserServlet?flag=list");
                    rd.forward(request, response);
                    return;
                }
            }
        }
        request.getSession().setAttribute("loginResult", "no");
        rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
