package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    .login{width: 340px;height: 240px;margin: 50px auto;padding: auto;\n");
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
      out.write("    h2{color:#000000;}\n");
      out.write("    body{\n");
      out.write("        background-repeat:no-repeat ;\n");
      out.write("        background-size:100% 100%;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("    }\n");
      out.write("    .submit{\n");
      out.write("        width: 100%;\n");
      out.write("        color: #FFFFFF;\n");
      out.write("        height: 30px;\n");
      out.write("        background-color:#6699FF;\n");
      out.write("        border: none;\n");
      out.write("        border-radius:15px;     \n");
      out.write("    }\n");
      out.write("    a{color: blue; text-decoration:none;}\n");
      out.write("    a:hover{color: aquamarine; text-decoration:underline; }\n");
      out.write("</style>\n");
      out.write("<body background=\"/DatabasePT/img/背景1.jpg\">\n");
      out.write("<center>\n");
      out.write("    <h1>IT硬件报价系统</h1>\n");
      out.write("    <form class=\"login\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LoginServlet\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <h2>登录</h2>\n");
      out.write("            <tr>\n");
      out.write("                <td><input name=\"username\" type=\"text\" placeholder=\"账号\" style=\"width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input name=\"password\" type=\"password\" placeholder=\"密码\" style=\"width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <td style=\"color:#333333\">\n");
      out.write("                    管理员：<input type=\"radio\" name=\"role\" value=\"1\" checked>\n");
      out.write("                    商家：<input type=\"radio\" name=\"role\" value=\"2\">\n");
      out.write("                    买家：<input type=\"radio\" name=\"role\" value=\"3\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input class=\"submit\" type=\"submit\" value=\"登录\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <a href=\"register.jsp\">点击立即注册</a>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginResult=='no'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <script>window.alert(\"账号或密码错误!!!\");</script>\n");
          out.write("    ");
session.setAttribute("loginResult", null);
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
