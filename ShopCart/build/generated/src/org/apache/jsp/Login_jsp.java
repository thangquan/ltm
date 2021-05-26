package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html");
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
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("\n");
      out.write("                padding:0;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                width: 100%;\n");
      out.write("                height:100%;\n");
      out.write("            }\n");
      out.write("            #AlertBox {\n");
      out.write("                text-align: center;\n");
      out.write("                color:red;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #buttonSigup {\n");
      out.write("                font-family: Poppins-Medium;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: #fff;\n");
      out.write("                line-height: 1.2;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -moz-box;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background: transparent;\n");
      out.write("\n");
      out.write("                background-image: url(Login/images/bg-01.jpg);\n");
      out.write("            }\n");
      out.write("            #main {\n");
      out.write("\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("                background-image: url(Login/images/background.jpeg);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*            #main:before {\n");
      out.write("                            content : \"\";\n");
      out.write("                            display: block;\n");
      out.write("                            position: absolute;\n");
      out.write("                            top: 0;\n");
      out.write("                            left: 0;\n");
      out.write("                            background-image: url(Login/images/background.jpeg);\n");
      out.write("                            width: 100%;\n");
      out.write("                            height: 100%;\n");
      out.write("                            opacity : 0.2;\n");
      out.write("                   \n");
      out.write("                        }*/\n");
      out.write("            #logreg-forms {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #logreg-forms form{\n");
      out.write("\n");
      out.write("                margin: 0 auto;\n");
      out.write("                /*height: 100%;*/\n");
      out.write("                background-image: url(Login/images/bg-01.jpg);\n");
      out.write("                width: 100%;\n");
      out.write("                min-height: 90vh;\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -moz-box;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                padding:60px 55px;\n");
      out.write("                margin-bottom: 2rem;\n");
      out.write("            }\n");
      out.write("            .form-signin {\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"logreg-forms\">\n");
      out.write("                <div><p id=\"AlertBox\">\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </p></div>\n");
      out.write("                <form class=\"form-signin\" action=\"LoginControl\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign in</h1>\n");
      out.write("\n");
      out.write("                    <input name=\"user\"  type=\"text\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Username\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input name=\"pass\"  type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("\n");
      out.write("                    <div  style=\"width: 100%;\" class=\"form-group form-check\">\n");
      out.write("                        <input name=\"remember\" value=\"1\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"exampleCheck1\">Remember me</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button id=\"buttonSigup\" class=\"btn-block \" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> Sign in</button>\n");
      out.write("                    <hr>\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"button\" id=\"btn-signup\"><i class=\"fas fa-user-plus\"></i> Sign up New Account</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form action=\"RegisterControl\" method=\"post\" class=\"form-signup\">\n");
      out.write("                    <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign up</h1>\n");
      out.write("                    <input name=\"user\" type=\"text\" id=\"user-name\" class=\"form-control\" placeholder=\"User name\" required=\"\" autofocus=\"\">\n");
      out.write("                    <input name=\"pass\" type=\"password\" id=\"user-pass\" class=\"form-control\" placeholder=\"Password\" required autofocus=\"\">\n");
      out.write("                    <input name=\"repass\" type=\"password\" id=\"user-repeatpass\" class=\"form-control\" placeholder=\"Repeat Password\" required autofocus=\"\">\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"submit\"><i class=\"fas fa-user-plus\"></i> Sign Up</button>\n");
      out.write("                    <a href=\"#\" id=\"cancel_signup\"><i class=\"fas fa-angle-left\"></i> Back</a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("            function toggleResetPswd(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle() // display:block or none\n");
      out.write("                $('#logreg-forms .form-reset').toggle() // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function toggleSignUp(e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                $('#logreg-forms .form-signin').toggle(); // display:block or none\n");
      out.write("                $('#logreg-forms .form-signup').toggle(); // display:block or none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(() => {\n");
      out.write("                // Login Register Form\n");
      out.write("                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #cancel_reset').click(toggleResetPswd);\n");
      out.write("                $('#logreg-forms #btn-signup').click(toggleSignUp);\n");
      out.write("                $('#logreg-forms #cancel_signup').click(toggleSignUp);\n");
      out.write("            })\n");
      out.write("            $(function () {\n");
      out.write("                $('#AlertBox').removeClass('hide');\n");
      out.write("                $('#AlertBox').delay(4000).slideUp(500);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.message==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.message!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }
}
