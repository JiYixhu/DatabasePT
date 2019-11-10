package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .login{width: 340px;height: 280px;margin: 50px auto;padding: auto;\n");
      out.write("           align-items: center;border: 4px solid #3399ff;border-radius: 10px;\n");
      out.write("           background-color:rgba(238,238,238,0.5);\n");
      out.write("    }    \n");
      out.write("    h1{\n");
      out.write("        color:  #FFFFFF;\n");
      out.write("        /*color: transparent;\n");
      out.write("        background-color :#0066FF;*/\n");
      out.write("        text-shadow : rgba(255,255,255,0.5) 0 5px 5px, rgba(255,255,255,0.2) 1px 3px 3px;\n");
      out.write("        -webkit-background-clip : text;\n");
      out.write("        margin: 30px auto 0;\n");
      out.write("        font-size: 50px;\n");
      out.write("        letter-spacing: 2pt;\n");
      out.write("        font-family: SimHei;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("        background-repeat:no-repeat ;\n");
      out.write("        background-size:100% 100%;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("    }\n");
      out.write("    .submit{\n");
      out.write("        width: 40%;\n");
      out.write("        color: #FFFFFF;\n");
      out.write("        height: 30px;\n");
      out.write("        background-color:#6699FF;\n");
      out.write("        border: none;\n");
      out.write("        border-radius:15px;        \n");
      out.write("    }\n");
      out.write("    td{color:#333333;}\n");
      out.write("    .t{/*下划线样式*/\n");
      out.write("        border-bottom: 1px solid #005aa7;\n");
      out.write("        color:#005aa7;\n");
      out.write("        border-top: 0px;border-left: 0px;border-right: 0px;\n");
      out.write("        background-color: transparent;\n");
      out.write("        height: 30px;\n");
      out.write("    }\n");
      out.write("    .tt{width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;}/*备用样式*/\n");
      out.write("</style>\n");
      out.write("<body background=\"/DatabasePT/img/背景1.jpg\">\n");
      out.write("<center>\n");
      out.write("    <h1>IT硬件报价系统</h1>\n");
      out.write("    <form class=\"login\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserServlet?flag=register\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <h2>注册</h2>\n");
      out.write("            <tr>\n");
      out.write("                <td>请输入用户名:</td><td><input class=\"t\" name=\"username\" placeholder=\"十三个字符以内\" type=\"text\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>请输入密码:</td><td><input class=\"t\" name=\"pwd1\" placeholder=\"十个字符以内\" type=\"password\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <td>请确认密码：</td><td><input class=\"t\" name=\"pwd2\" placeholder=\"十个字符以内\" type=\"password\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <td>请输入手机号：</td><td><input class=\"t\" name=\"tel\" placeholder=\"中国大陆11位手机号\" type=\"text\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <input class=\"submit\" type=\"submit\" value=\"提交\">\n");
      out.write("        <input class=\"submit\" type=\"button\" value=\"返回\" onclick=\"location.href = 'login.jsp'\">\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='isnull'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"有为空的项，请填写完毕！\");</script>\n");
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
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='no'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"注册失败!用户名重复！\");</script>\n");
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
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_2.setPageContext(_jspx_page_context);
      _jspx_th_c_if_2.setParent(null);
      _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='pwdwrong'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"请确认两次密码相同！\");</script>\n");
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
      out.write('\n');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result=='yes'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"注册成功!3秒后返回登录界面！\");</script>\n");
          out.write("    ");

        session.setAttribute("result", null);
        response.setHeader("refresh", "3;URL=login.jsp");
    
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
