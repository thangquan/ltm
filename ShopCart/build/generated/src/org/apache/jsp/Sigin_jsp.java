package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sigin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login V4</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Login/images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/animsition/css/animsition.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                font-family: 'ui-serif';\n");
      out.write("            }\n");
      out.write("            .p-t-155 {\n");
      out.write("                padding-top: 20px;\n");
      out.write("            }\n");
      out.write("            .txt2 {\n");
      out.write("                padding: 10px 15px; \n");
      out.write("                /*background: deeppink;*/\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logreg-forms\">\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('Login/images/bg-01.jpg');\">\n");
      out.write("                <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\n");
      out.write("                    <form class=\"login100-form validate-form form-signin\">\n");
      out.write("                        <span style=\"font-family:'sans-serif'; font-weight: bold \" class=\"login100-form-title p-b-49\">\n");
      out.write("                            Trang đăng nhập\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Username is reauired\">\n");
      out.write("                            <span class=\"label-input100\">Tên đăng nhập</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Nhập tên đăng nhập\">\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">\n");
      out.write("                            <span class=\"label-input100\">Mật khẩu</span>\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"pass\" placeholder=\"Nhập mật khẩu\">\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf190;\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"text-right p-t-8 p-b-31\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Quên mật khẩu?\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container-login100-form-btn\">\n");
      out.write("                            <div class=\"wrap-login100-form-btn\">\n");
      out.write("                                <div class=\"login100-form-bgbtn\"></div>\n");
      out.write("                                <button class=\"login100-form-btn\">\n");
      out.write("                                    Đăng nhập\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"flex-col-c p-t-155\">\n");
      out.write("                            <span class=\"txt1 p-b-17\">\n");
      out.write("                                Bạn chưa có tài khoản?\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" id=\"btn-signup\" class=\"txt2\">\n");
      out.write("                                Đăng ký\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"RegisterControl\" method=\"post\" class=\"form-signup\">\n");
      out.write("                        <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign up</h1>\n");
      out.write("                        <input name=\"user\" type=\"text\" id=\"user-name\" class=\"form-control\" placeholder=\"User name\" required=\"\" autofocus=\"\">\n");
      out.write("                        <input name=\"pass\" type=\"password\" id=\"user-pass\" class=\"form-control\" placeholder=\"Password\" required autofocus=\"\">\n");
      out.write("                        <input name=\"repass\" type=\"password\" id=\"user-repeatpass\" class=\"form-control\" placeholder=\"Repeat Password\" required autofocus=\"\">\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-primary btn-block\" type=\"submit\"><i class=\"fas fa-user-plus\"></i> Sign Up</button>\n");
      out.write("                        <a href=\"#\" id=\"cancel_signup\"><i class=\"fas fa-angle-left\"></i> Back</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"Login/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"Login/vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"Login/js/main.js\"></script>\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
