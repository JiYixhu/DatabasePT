package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin/header.jsp");
  }

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
      out.write('\n');
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
      out.write("        top: 67px;/*离顶部的距离为*/\n");
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
      out.write('\n');

   request.setCharacterEncoding("GB2312");
   response.setCharacterEncoding("GB2312");

      out.write("\n");
      out.write("<style>\n");
      out.write("    h1{\n");
      out.write("        margin-top: 80px;\n");
      out.write("        color: transparent;\n");
      out.write("        background-color :#008B8B;\n");
      out.write("        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;\n");
      out.write("        -webkit-background-clip : text;\n");
      out.write("    }\n");
      out.write("    table{border-collapse: collapse;}\n");
      out.write("    table td{text-align: center;border: 3px solid #48D1CC;}\n");
      out.write("    table tr{height: 40px;}\n");
      out.write("    .anniu\n");
      out.write("        {\n");
      out.write("            width: 120px;\n");
      out.write("            color: #fff;\n");
      out.write("            height: 30px;\n");
      out.write("            background-color:#FFA500;\n");
      out.write("            border: none;\n");
      out.write("            border-radius:5px;\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <h1>商家添加</h1><!--添加商家信息的时候务必包括所有信息，账号密码等！！！ -->\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminServlet?flag=updateBu\" method=\"post\">\n");
      out.write("        <table width=\"60%\">\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家编号</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuName\" placeholder=\"");
      out.print(request.getParameter("BuName"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家账号</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuName\" placeholder=\"");
      out.print(request.getParameter("BuName"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家密码</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuName\" placeholder=\"");
      out.print(request.getParameter("BuName"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家名称</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuName\" placeholder=\"");
      out.print(request.getParameter("BuName"));
      out.write("\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家地址</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuAddress\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家电话</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input style=\"width: 415px;height: 30px;\" type=\"text\" name=\"BuTel\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <input class=\"anniu\" type=\"submit\" value=\"提交\">\n");
      out.write("        <input class=\"anniu\" type=\"reset\" value=\"重置\">\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
