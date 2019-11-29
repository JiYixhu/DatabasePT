package servlets;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import services.AdminService;

/**
 *
 * @author 季忆
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
public class UploadServlet extends HttpServlet {

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
        RequestDispatcher rd = null;
        AdminService as = new AdminService();
        String HaNo = request.getParameter("HaNo");
        String HaName = request.getParameter("HaName");
        String HaCate = request.getParameter("HaCate");
        String HaBrand = request.getParameter("HaBrand");
        String HaPara = request.getParameter("HaPara");
        String HaPic = request.getParameter("HaPic");
        System.out.println(HaNo + HaName + HaCate + HaBrand + HaPara + HaPic);
        Boolean isMultipart = ServletFileUpload.isMultipartContent(request);//解析和检查请求，是否是post方式，是否是二进制流格式
        if (!isMultipart) {
            return; //如果不是就不用上传了
        } else {
            String path = null;
            String realname = null;
            try {
                //创建FileItemFactory对象
                FileItemFactory factory = new DiskFileItemFactory();
                //创建文件上传的处理器
                ServletFileUpload upload = new ServletFileUpload(factory);
                //解析请求
                List<FileItem> items = upload.parseRequest(request);
                //迭代出每一个FileItem
                for (FileItem item : items) {
                    String fileName = item.getFieldName();
                    if (item.isFormField()) {
                        //普通的表单控件
                        if (fileName.equals("HaNo")) {
                            //获取表单属性的值
                            HaNo = item.getString("GB2312");
                            System.out.println("HaNo" + "->" + HaNo);
                        }
                        if (fileName.equals("HaName")) {
                            //获取表单属性的值
                            HaName = item.getString("GB2312");
                            System.out.println("HaName" + "->" + HaName);
                        }
                        if (fileName.equals("HaCate")) {
                            //获取表单属性的值
                            HaCate = item.getString("GB2312");
                            System.out.println("HaCate" + "->" + HaCate);
                        }
                        if (fileName.equals("HaBrand")) {
                            //获取表单属性的值
                            HaBrand = item.getString("GB2312");
                            System.out.println("HaBrand" + "->" + HaBrand);
                        }
                        if (fileName.equals("HaPara")) {
                            //获取表单属性的值
                            HaPara = item.getString("GB2312");
                            System.out.println("HaPara" + "->" + HaPara);
                        }
                    } else {
                        //上传文件的控件
                        realname = item.getName();
                        System.out.println("fileName" + "->" + realname); //一个的标签的name="HaPic"，一个是文件的name
                        if (realname.contains("\\")) {
                            //如果包含则截取字符串
                            realname = realname.substring(realname.lastIndexOf("\\") + 1);
                        }
                        System.out.println("fileName" + "->" + realname);
                        path = "D:\\码农进阶路\\数据库实训\\DatabasePT\\web\\img";//绝对路径
                        System.out.println(path);
                        item.write(new File(path, realname)); //把上传的文件保存到某个文件中
                    }
                }
            } catch (FileUploadException ex) {
                Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            Map parameters = new HashMap();
            parameters.put("HaNo", HaNo);
            parameters.put("HaName", HaName);
            parameters.put("HaCate", HaCate);
            parameters.put("HaBrand", HaBrand);
            parameters.put("HaPara", HaPara);
            String Hapic = "/DatabasePT/img/"+ realname;//存入数据库的应是相对路径
            parameters.put("HaPic", Hapic);
            int rl = as.addHa(parameters);
            String result = (rl > 0 ? "添加成功" : "添加失败");
            request.setAttribute("result", result);
            rd = request.getRequestDispatcher("/admin/addHa.jsp");
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
