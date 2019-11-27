package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteCa_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    request.setCharacterEncoding("GB2312");
    response.setCharacterEncoding("GB2312");

      out.write("\n");
      out.write("<center>\n");
      out.write("    <style>\n");
      out.write("        h1{color:#6699CC;}\n");
      out.write("        .anniu\n");
      out.write("        {\n");
      out.write("            width: 120px;\n");
      out.write("            color: #fff;\n");
      out.write("            height: 30px;\n");
      out.write("            background-color:#DC143C;\n");
      out.write("            border: none;\n");
      out.write("            border-radius:5px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <h1>确认删除&nbsp");
      out.print(request.getParameter("BuName"));
      out.write("&nbsp这个类别吗?<h1>\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=deleteBu\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"BuNo\" value=\"");
      out.print(request.getParameter("BuNo"));
      out.write("\">\n");
      out.write("                <br><input class=\"anniu\" type=\"submit\" value=\"确认\"> \n");
      out.write("                <input class=\"anniu\" style=\"background-color: gray;\" type=\"button\" value=\"取消\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=Bulist'\">\n");
      out.write("        </form>\n");
      out.write("</center>\n");
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
