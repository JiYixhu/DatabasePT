package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=GB2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<div class=\"cap\" align=\"left\">\n");
      out.write("    <ul>IT硬件报价系统</ul>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<div class=\"box\" align=\"center\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">首页</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserServlet?flag=top\">下载排行</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserServlet?flag=sort\">分类查询</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserServlet?flag=search\">分类搜索</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/login.jsp\">管理功能</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("    <style>\n");
      out.write("            .box{\n");
      out.write("            width: 600px;\n");
      out.write("            height: 50px;\n");
      out.write("            background: #48D1CC;\n");
      out.write("            margin-top: 50px; \n");
      out.write("            margin-left: 20px;\n");
      out.write("            border-radius:10px;\n");
      out.write("            box-shadow: 0 5px 2px #008B8B;\n");
      out.write("        }\n");
      out.write("        .box ul{\n");
      out.write("            height: 100%;\n");
      out.write("            padding: 0 5%;\n");
      out.write("            list-style: none;\n");
      out.write("            color: #fff;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            font:bold 16px/50px Arial;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .box ul li{\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            text-shadow:2px 2px 4px rgba(0,0,0,.5);\n");
      out.write("            background: linear-gradient(red,#a82724,red) no-repeat right/1px 15px;\n");
      out.write("        }\n");
      out.write("        .box ul li:last-of-type{\n");
      out.write("            background:none;\n");
      out.write("        }\n");
      out.write("        .box ul li a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:#FFFFFF;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .box ul li a:hover{\n");
      out.write("            transform: rotate(10deg);\n");
      out.write("        }\n");
      out.write("        .cap{\n");
      out.write("            margin-top:  5px;\n");
      out.write("            margin-left: 2px;\n");
      out.write("        }\n");
      out.write("        .cap ul{\n");
      out.write("            font-size: 30px;\n");
      out.write("        }\n");
      out.write("</style>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
