package org.apache.jsp.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class third_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/business/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("/BusinessServlet?flag=Searchlist\">硬件列表</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/BusinessServlet?flag=Pricelist\">报价列表</a></li>\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/business/third.jsp\">添加报价</a></li>\n");
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
      out.write("\n");
      out.write("<style>\n");
      out.write("    h1{\n");
      out.write("        margin-top: 50px;\n");
      out.write("        font-size: 30px;\n");
      out.write("        color: #6699CC;\n");
      out.write("        font-family: \"Arial\",\"Microsoft YaHei\",\"黑体\",\"宋体\",sans-serif;\n");
      out.write("    }\n");
      out.write("    table{border-collapse: collapse;}\n");
      out.write("    table td{text-align: center;border: 3px solid #48D1CC;}\n");
      out.write("    table tr{height: 40px;}\n");
      out.write("    .anniu\n");
      out.write("    {\n");
      out.write("        width: 120px;\n");
      out.write("        color: #FFFFFF;\n");
      out.write("        height: 30px;\n");
      out.write("        background-color:#FFA500;\n");
      out.write("        border: none;\n");
      out.write("        border-radius:5px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<center>\n");
      out.write("    <br><h1>添加报价</h1><!--HaNo BuNo NowPrice 时间自动填入，点击添加时需确认商家密码-->\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/BusinessServlet?flag=add\" method=\"post\">\n");
      out.write("        <table width=\"60%\">\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\">硬件编号</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"1\" style=\"width: 415px;height: 30px;\" type=\"text\" name=\"THaNo\" placeholder=\"请保证编号是硬件表中存在的\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\">硬件名称</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"2\" style=\"width: 415px;height: 30px;\" type=\"text\" name=\"THaName\" placeholder=\"请保证名称和硬件表名称一致\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家编号</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"3\" style=\"width: 415px;height: 30px;\" type=\"text\" name=\"TBuNo\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家名称</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"4\" style=\"width: 415px;height: 30px;\" type=\"text\" name=\"TBuName\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >当前报价</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"5\" style=\"width: 415px;height: 30px;\" type=\"text\" name=\"TNowPrice\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td bgcolor=\"#AFEEEE\" width=\"30%\" >商家密码</td>\n");
      out.write("                <td width=\"70%\" >\n");
      out.write("                    <input id=\"6\" style=\"width: 415px;height: 30px;\" type=\"password\" name=\"TPwd\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <input class=\"anniu\" type=\"submit\" value=\"提交\" >\n");
      out.write("        <input class=\"anniu\" type=\"reset\" value=\"重置\">\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='密码错误'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"密码错误!\");</script>\n");
          out.write("    ");
session.setAttribute("result", null);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='isnull'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"各项均不能为空！\");</script>\n");
          out.write("    ");
session.setAttribute("result", null);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write('\n');
      out.write(' ');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='添加成功'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"添加成功！\");</script>\n");
          out.write("    ");
session.setAttribute("result", null);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      out.write("\n");
      out.write("     ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='添加失败'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"添加失败！\");</script>\n");
          out.write("    ");
session.setAttribute("result", null);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
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
