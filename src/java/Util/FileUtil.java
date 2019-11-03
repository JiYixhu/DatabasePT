package Util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import services.AdminService;

public class FileUtil {
    private final Map parameters = new HashMap();//存储表单信息
    private final Map file = new HashMap();//存储上传文件信息
    private final long max_size = 30 * 1024 * 1024;//最大的上传文件大小
    private String storeform = new String();//存储表单信息

    public int download(ServletContext servletContext, HttpServletResponse response, Map file) {
        String fileName = (String) file.get("fileName");
        String filePath = (String) file.get("filePath");
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        InputStream is = servletContext.getResourceAsStream(filePath);
        try {
            ServletOutputStream out = response.getOutputStream();
            IOUtils.copy(is, out);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    public int upload(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response) throws FileUploadException {
        int k = 0;
        AdminService as = new AdminService();
        try {
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            List<FileItem> list = servletFileUpload.parseRequest(request);//封装
            servletFileUpload.setSizeMax(max_size);//最大文件
            for (FileItem fileItem : list) {
                if (fileItem.isFormField()) {
                    String fieldName = fileItem.getFieldName();
                    String fieldValue = fileItem.getString();    //中文乱码
                    file.put(fieldName, fieldValue);
                } else {
                    String fileName = fileItem.getName();
                    fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
                    try (InputStream is = fileItem.getInputStream()) {
                        storeform = servletContext.getRealPath("/software");
                        File f = new File(storeform, fileName);
                        if (!f.getParentFile().exists()) {  //父目录不存在
                            f.getParentFile().mkdirs();        //mkdirs创建文件夹
                        }
                        FileUtils.copyInputStreamToFile(is, f);
                        is.close();
                        double size=f.length()/1024;
                        file.put("size",size+"");
                        String path=f.getPath().replace("\\", "/");
                        file.put("filePath", path.substring(path.substring(0, path.lastIndexOf("/")).lastIndexOf("/"), path.length()));
                        file.put("fileName", path.substring(path.lastIndexOf("/") + 1));
                    }
                }
            }
        } catch (IOException | FileUploadException e) {
            throw new RuntimeException(e);
        }
        k = as.uploadHa(storeform, file, parameters);
        return k > 0 ? 1 : 0;
    }
}
