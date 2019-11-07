/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
import services.AdminService;

/**
 *
 * @author 季忆
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {

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
        AdminService as = new AdminService();
        if ("Halist".equals(flag)) {
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.Halist(curPage);//!!!!
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/first.jsp");
            rd.forward(request, response);          
        } 
        else if ("Bulist".equals(flag)) {
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.Bulist(curPage);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/second.jsp");
            rd.forward(request, response);
        }
        else if ("Calist".equals(flag)) {
            String page = request.getParameter("page");//上一个页面哪里在传page的值
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.Calist(curPage);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/third.jsp");
            rd.forward(request, response);
        }
        else if ("Brlist".equals(flag)) {
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.Brlist(curPage);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/forth.jsp");
            rd.forward(request, response);
        }
        else if ("showHadetail".equals(flag)) {
            String id = request.getParameter("id");
            Map hardware = as.getById(id);
            request.setAttribute("hardware", hardware);//这句什么意思？
            rd = request.getRequestDispatcher("/admin/showHadetail.jsp");
            rd.forward(request, response);
        }
        else if ("PriceList".equals(flag)) {
            String id = request.getParameter("id");
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean =as.PriceList(curPage,id);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/PriceList.jsp");
            rd.forward(request, response);
        }
        else if ("add".equals(flag)) {
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String description = request.getParameter("description");
            String fileName = request.getParameter("fileName");
            Map paramters = new HashMap();
            paramters.put("name", name);
            paramters.put("type", type);
            paramters.put("description", description);
            //String str = fileName.substring(fileName.lastIndexOf("."), fileName.length());
            Map file = new HashMap();
            //String s = "" + Math.random();
            
            file.put("fileName", fileName);
            file.put("size", ""+(int) (Math.random() * 100000));//随机文件大小
            file.put("filePath", "/downloadcenter/" + fileName);   
            int rl = as.add(file, paramters);
            String result = (rl > 0 ? "添加成功" : "添加失败");
            request.setAttribute("result", result);
            request.setAttribute("parameType", type);
            rd = request.getRequestDispatcher("/admin/result.jsp");
            rd.forward(request, response);
        } else if ("update".equals(flag)) {
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String description = request.getParameter("description");
            String id = request.getParameter("id");
            Map paramters = new HashMap();
            paramters.put("name", name);
            paramters.put("type", type);
            paramters.put("description", description);
            paramters.put("id", id);
            int rl = as.updateInfo(paramters);//rl返回的是受影响的记录的行数
            String result = (rl > 0 ? "修改成功" : "修改失败");
            request.setAttribute("result", result);
            request.setAttribute("parameType", type);
            rd = request.getRequestDispatcher("/admin/result.jsp");
            rd.forward(request, response);
        } else if ("delete".equals(flag)) {
            String id = request.getParameter("id");
            Map paramters = new HashMap();
            paramters.put("id", id);
            int rl = as.deleteHa(paramters);
            String result = (rl > 0 ? "删除成功" : "删除失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/result.jsp");
            rd.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
