package org.apache.jsp.admin;

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
      out.write("<div class=\"logo\">\n");
      out.write("    <strong>IT硬件报价</strong>\n");
      out.write("    <b>|</b>\n");
      out.write("    <strong style=\" font-size: 20px\">专业 全面</strong>\n");
      out.write("</div>\n");
      out.write("<div class=\"box\" align=\"center\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.jsp\">登录页面</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=Halist\">硬件列表</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=Bulist\">商家列表</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=Calist\">类别列表</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=Brlist\">品牌列表</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<style>\n");
      out.write("    .logo{\n");
      out.write("        color: #000000;\n");
      out.write("        margin-top:15px;\n");
      out.write("        margin-left:15px;\n");
      out.write("        font-size: 30px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        letter-spacing: 2pt;\n");
      out.write("        font-family: SimHei;  \n");
      out.write("    }\n");
      out.write("    .box{\n");
      out.write("        /* 设置宽度高度背景颜色 */\n");
      out.write("        height: 50px;\n");
      out.write("        width:100%;\n");
      out.write("        background:#66CCFF;\n");
      out.write("        position: fixed; /*固定在顶部*/\n");
      out.write("        top: 67px;/*离顶部的距离为0*/\n");
      out.write("    }\n");
      out.write("    .box ul{\n");
      out.write("        /* 清除ul标签的默认样式 */\n");
      out.write("        width: 80%;\n");
      out.write("        list-style-type: none;\n");
      out.write("        margin: 0;            \n");
      out.write("        padding: 0;\n");
      out.write("        overflow: hidden;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .box li {    \n");
      out.write("        float:left; /* 使li内容横向浮动，即横向排列  */\n");
      out.write("        margin-right:35px;  /* 两个li之间的距离*/\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .box li a{\n");
      out.write("        /* 设置链接内容显示的格式*/\n");
      out.write("        display: block; /* 把链接显示为块元素可使整个链接区域可点击 */\n");
      out.write("        color:white;\n");
      out.write("        text-align: center;\n");
      out.write("        font-weight: bold;\n");
      out.write("        padding: 14px 16px;\n");
      out.write("        letter-spacing: 3px;/*字符间隔*/\n");
      out.write("        text-decoration: none; /* 去除下划线 */\n");
      out.write("    }\n");
      out.write("    .box li a:hover{\n");
      out.write("        /* 鼠标选中时背景变色 */\n");
      out.write("        background-color: #FFCC99;\n");
      out.write("    }\n");
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
