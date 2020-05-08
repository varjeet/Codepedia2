package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("  \n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"Signup.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"Login.js\" type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function sendotp()\n");
      out.write("{\n");
      out.write("             var xhr = new XMLHttpRequest;\n");
      out.write("                    var mail=document.getElementById(\"modal_mail\").value;\n");
      out.write("                    console.log(mail);\n");
      out.write("                      var formdata=new FormData();\n");
      out.write("                   formdata.append(\"mail\",mail);\n");
      out.write("                 \n");
      out.write("                    xhr.onreadystatechange = function ()\n");
      out.write("                    {\n");
      out.write("                        if (xhr.readyState === 4 && xhr.status == 200)\n");
      out.write("                        {\n");
      out.write("                            //get response from server\n");
      out.write("                            var res = xhr.responseText.trim();\n");
      out.write("                           \n");
      out.write("                             if(res=== \"success\")\n");
      out.write("                            {\n");
      out.write("                               alert(\"A mail has been sent to your email\");\n");
      out.write("                                window.location.href=\"EnterOtp.jsp\";\n");
      out.write("                            }\n");
      out.write("                            else\n");
      out.write("                            {\n");
      out.write("                                   alert(\"Error Occured sending Otp\");      \n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    \n");
      out.write("                    xhr.open(\"POST\",\"./RecoverPassword\", true);\n");
      out.write("                    \n");
      out.write("                    //alert(\"Check Console Log\");\n");
      out.write("                    \n");
      out.write("                  //  console.log(formdata);\n");
      out.write("                    xhr.send(formdata);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff)\">\n");
      out.write("     <div class=\"wrapper fadeInDown\">\n");
      out.write("  <div id=\"formContent\">\n");
      out.write("    <!-- Tabs Titles -->\n");
      out.write("    <h2 class=\"active\"> Sign In </h2>\n");
      out.write("    <h2 class=\"inactive underlineHover\">Sign Up </h2>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Login Form -->\n");
      out.write("    <form id=\"form1\">\n");
      out.write("   <!-- <input type=\"text\" id=\"mail\" class=\"fadeIn third \" name=\"mail\" placeholder=\"Enter E-mail\" onkeyup=\"go4()\"> <i  id=\"icon_mail\" class=\"fa fa-check\" style=\"visibility: hidden\"></i>-->\n");
      out.write("     <input type=\"text\" id=\"username\" class=\"fadeIn second   \" name=\"username\" placeholder=\"Enter Username\" onkeyup=\"go3()\"><i  id=\"icon_username\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \n");
      out.write("      <input type=\"password\" id=\"password\" class=\"fadeIn third \" name=\"password\" placeholder=\"Enter password\" onkeyup=\"go5()\"><i id=\"icon_password\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \n");
      out.write("   <!--   <input type=\"text\" id=\"mobile\" class=\"fadeIn third \" name=\"mobile\" placeholder=\"Enter mobile\" onkeyup=\"go6()\"><i id=\"icon_mobile\"  class=\"fa fa-check\" style=\"visibility: hidden\"></i> -->\n");
      out.write("      \n");
      out.write("              \n");
      out.write("      <div class=\"container-fluid mt-lg-4 \">\n");
      out.write("          <input type=\"button\" class=\"fadeIn fourth pdt-4\" value=\"Log In\" onclick=\"go()\" name=\"submitbtn\">\n");
      out.write("      </div>\n");
      out.write("   </form>\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <!-- Forgot Passowrd -->\n");
      out.write("    <div id=\"formFooter\">\n");
      out.write("       <a href=\"#\"    class=\"underlineHover\" data-toggle=\"modal\" data-target=\"#emailModal\"  >Forgot Password?</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--Modal for emial otp named email modal-->\n");
      out.write("        <div class=\"container\" >\n");
      out.write("  \n");
      out.write("  <div class=\"modal fade\" id=\"emailModal\" role=\"dialog\" >\n");
      out.write("    <div class=\"modal-dialog\" >\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\" style=\"background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff) \">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <!--Design-->\n");
      out.write("           \n");
      out.write("       <div class=\"d-flex flex-column\">\n");
      out.write("           \n");
      out.write("           <!--    <img class=\"rounded\" src=\"myuploads/lock.png\" style=\"height: auto;width: 100%\">-->\n");
      out.write("           <div class=\"d-flex justify-content-center\">\n");
      out.write("           <img class=\"rounded img-fluid ml-5\" src=\"myuploads/lock.png\" style=\"width: 200px;height: 200px\">\n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("           <div class=\"d-flex justify-content-center mt-3\"> \n");
      out.write("           <h3 class=\"h3 font-weight-bold\" >Forgot Password?</h3>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"d-flex justify-content-center mt-3\"> \n");
      out.write("           <h5 class=\"h5\" >Enter Email to get one time password(OTP)</h5>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("           <div class=\"d-flex justify-content-center mt-3\">\n");
      out.write("           <input type=\"text\" placeholder=\"Enter mai\" id=\"modal_mail\" name=\"modal_mail\">    \n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("           \n");
      out.write("            <!--button-->\n");
      out.write("<div class=\"d-flex justify-content-center mt-3\">\n");
      out.write("    <input type=\"button\" class=\"btn btn-outline-primary btn-lg \"   value=\"Send OTP\"  onclick=\"sendotp()\"  />\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("      <!--button-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
