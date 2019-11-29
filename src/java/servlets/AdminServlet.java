/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            String cate = request.getParameter("selectcate");
            String brand = request.getParameter("selectbrand");
            String name = request.getParameter("selectname");
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            Category category = as.SearchCate();
            request.setAttribute("category", category);//!!!!
            Brand bbrand = as.SearchBrand();
            request.setAttribute("bbrand", bbrand);//!!!!
            PageBean pageBean = as.Halist(cate, brand, name, curPage);
            request.setAttribute("pageBean", pageBean);
            request.setAttribute("parameCate", cate);
            request.setAttribute("parameBrand", brand);
            rd = request.getRequestDispatcher("/admin/first.jsp");
            rd.forward(request, response);
        } else if ("Bulist".equals(flag)) {
            String Number = request.getParameter("Number");
            String Name = request.getParameter("Name");
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.Bulist(Number, Name, curPage);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/second.jsp");
            rd.forward(request, response);
        } else if ("Calist".equals(flag)) {
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
        } else if ("Brlist".equals(flag)) {
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
        } else if ("showHadetail".equals(flag)) {
            String id = request.getParameter("id");
            Map hardware = as.getById(id);
            request.setAttribute("hardware", hardware);
            rd = request.getRequestDispatcher("/admin/showHadetail.jsp");
            rd.forward(request, response);
        } else if ("PriceList".equals(flag)) {
            String id = request.getParameter("id");
            String page = request.getParameter("page");
            int curPage = 0;
            if (page == null || page.length() < 1) {
                curPage = 1;
            } else {
                curPage = Integer.parseInt(page);
            }
            PageBean pageBean = as.PriceList(curPage, id);
            request.setAttribute("pageBean", pageBean);
            rd = request.getRequestDispatcher("/admin/PriceList.jsp");
            rd.forward(request, response);
        } else if ("add".equals(flag)) {
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String description = request.getParameter("description");
            String fileName = request.getParameter("fileName");
            Map parameters = new HashMap();
            parameters.put("name", name);
            parameters.put("type", type);
            parameters.put("description", description);
            //String str = fileName.substring(fileName.lastIndexOf("."), fileName.length());
            Map file = new HashMap();
            //String s = "" + Math.random();

            file.put("fileName", fileName);
            file.put("size", "" + (int) (Math.random() * 100000));//随机文件大小
            file.put("filePath", "/downloadcenter/" + fileName);
            int rl = as.add(file, parameters);
            String result = (rl > 0 ? "添加成功" : "添加失败");
            request.setAttribute("result", result);
            request.setAttribute("parameType", type);
            rd = request.getRequestDispatcher("/admin/result.jsp");
            rd.forward(request, response);
        } else if ("deleteHa".equals(flag)) {
            String HaNo = request.getParameter("HaNo");
            Map parameters = new HashMap();
            parameters.put("HaNo", HaNo);
            int rl = as.deleteHa(parameters);
            String result = (rl > 0 ? "删除成功" : "删除失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/first.jsp");
            rd.forward(request, response);
        } else if ("deleteBu".equals(flag)) {
            String BuNo = request.getParameter("BuNo");
            Map parameters = new HashMap();
            parameters.put("BuNo", BuNo);
            int rl = as.deleteBu(parameters);
            String result = (rl > 0 ? "删除成功" : "删除失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/second.jsp");
            rd.forward(request, response);
        } else if ("deleteCa".equals(flag)) {
            String HaCateNo = request.getParameter("HaCateNo");
            Map parameters = new HashMap();
            parameters.put("HaCateNo", HaCateNo);
            int rl = as.deleteCa(parameters);
            String result = (rl > 0 ? "删除成功" : "删除失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/third.jsp");
            rd.forward(request, response);
        } else if ("deleteBr".equals(flag)) {
            String HaBrandNo = request.getParameter("HaBrandNo");
            Map parameters = new HashMap();
            parameters.put("HaBrandNo", HaBrandNo);
            int rl = as.deleteBr(parameters);
            String result = (rl > 0 ? "删除成功" : "删除失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/forth.jsp");
            rd.forward(request, response);
        } else if ("updateHa".equals(flag)) {
            String HaName = request.getParameter("HaName");
            String HaPara = request.getParameter("HaPara");
            String HaNo = request.getParameter("HaNo");
            Map parameters = new HashMap();
            parameters.put("HaName", HaName);
            parameters.put("HaPara", HaPara);
            parameters.put("HaNo", HaNo);
            int rl = as.updateHa(parameters);//rl返回的是受影响的记录的行数
            String result = (rl > 0 ? "修改成功" : "修改失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/first.jsp");
            rd.forward(request, response);
        } else if ("updateBu".equals(flag)) {
            String BuName = request.getParameter("BuName");
            String BuAddress = request.getParameter("BuAddress");
            String BuTel = request.getParameter("BuTel");
            String BuNo = request.getParameter("BuNo");
            Map parameters = new HashMap();
            parameters.put("BuName", BuName);
            parameters.put("BuAddress", BuAddress);
            parameters.put("BuTel", BuTel);
            parameters.put("BuNo", BuNo);
            int rl = as.updateBu(parameters);//rl返回的是受影响的记录的行数
            String result = (rl > 0 ? "修改成功" : "修改失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/second.jsp");
            rd.forward(request, response);
        } else if ("updateCa".equals(flag)) {
            String HaCateNo = request.getParameter("HaCateNo");
            String HaCate = request.getParameter("HaCate");
            Map parameters = new HashMap();
            parameters.put("HaCateNo", HaCateNo);
            parameters.put("HaCate", HaCate);
            int rl = as.updateCa(parameters);//rl返回的是受影响的记录的行数
            String result = (rl > 0 ? "修改成功" : "修改失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/third.jsp");
            rd.forward(request, response);
        } else if ("updateBr".equals(flag)) {
            String HaBrandNo = request.getParameter("HaBrandNo");
            String HaBrand = request.getParameter("HaBrand");
            Map parameters = new HashMap();
            parameters.put("HaBrandNo", HaBrandNo);
            parameters.put("HaBrand", HaBrand);
            int rl = as.updateBr(parameters);//rl返回的是受影响的记录的行数
            String result = (rl > 0 ? "修改成功" : "修改失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/forth.jsp");
            rd.forward(request, response);
        } else if ("addBu".equals(flag)) {
            String result;
            String BuNo = request.getParameter("BuNo");
            String BuID = request.getParameter("BuID");
            String BuPwd1 = request.getParameter("BuPwd1");
            String BuPwd2 = request.getParameter("BuPwd2");
            String BuName = request.getParameter("BuName");
            String BuAdd = request.getParameter("BuAdd");
            String BuTel = request.getParameter("BuTel");
            if ("".equals(BuNo) || "".equals(BuID) || "".equals(BuPwd1) || "".equals(BuPwd2) || "".equals(BuName) || "".equals(BuAdd) || "".equals(BuTel)) {
                result = "isnull";
            } else if (BuPwd2.equals(BuPwd1)) {
                request.getSession().setAttribute("result", "ok");
                Map parameters = new HashMap();
                parameters.put("BuNo", BuNo);
                parameters.put("BuID", BuID);
                parameters.put("BuPwd1", BuPwd1);
                parameters.put("BuName", BuName);
                parameters.put("BuAdd", BuAdd);
                parameters.put("BuTel", BuTel);
                int rl = as.addBu(parameters);
                result = (rl > 0 ? "添加成功" : "添加失败");
            } else {
                result = "密码错误";
            }
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/addBu.jsp");
            rd.forward(request, response);
        } else if ("addCa".equals(flag)) {
            String result;
            String HaCateNo = request.getParameter("HaCateNo");
            String HaCate = request.getParameter("HaCate");
            if ("".equals(HaCateNo) || "".equals(HaCate)) {
                result = "isnull";
            } else {
                request.getSession().setAttribute("result", "ok");
                Map parameters = new HashMap();
                parameters.put("HaCateNo", HaCateNo);
                parameters.put("HaCate", HaCate);
                int rl = as.addCa(parameters);
                result = (rl > 0 ? "添加成功" : "添加失败");
            }
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/addCa.jsp");
            rd.forward(request, response);
        } else if ("addBr".equals(flag)) {
            String result;
            String HaBrandNo = request.getParameter("HaBrandNo");
            String HaBrand = request.getParameter("HaBrand");
            if ("".equals(HaBrandNo) || "".equals(HaBrand)) {
                result = "isnull";
            } else {
                request.getSession().setAttribute("result", "ok");
                Map parameters = new HashMap();
                parameters.put("HaBrandNo", HaBrandNo);
                parameters.put("HaBrand", HaBrand);
                int rl = as.addBr(parameters);
                result = (rl > 0 ? "添加成功" : "添加失败");
            }
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/addBr.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
