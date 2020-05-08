package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n");
      out.write("  \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"Signup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"Signup.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("<script>\r\n");
      out.write(" function go1()\r\n");
      out.write("    {\r\n");
      out.write("      design(\"firstname\",\"icon_firstname\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function go2()\r\n");
      out.write("    {\r\n");
      out.write("        design(\"lastname\",\"icon_lastname\");\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     function go3()\r\n");
      out.write("    {\r\n");
      out.write("        design(\"username\",\"icon_username\");\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     function go4()\r\n");
      out.write("    {\r\n");
      out.write("        design(\"mail\",\"icon_mail\");\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     function go5()\r\n");
      out.write("    {\r\n");
      out.write("        design(\"password\",\"icon_password\");\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     function go6()\r\n");
      out.write("    {\r\n");
      out.write("        design(\"mobile\",\"icon_mobile\");\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     function design(input_name,icon_name)\r\n");
      out.write("     {\r\n");
      out.write("         var text=document.getElementById(input_name).value;\r\n");
      out.write("       if(text===\"\")\r\n");
      out.write("       {\r\n");
      out.write("           document.getElementById(icon_name).className=\"fa fa-times\";\r\n");
      out.write("           document.getElementById(icon_name).style.visibility=\"visible\";\r\n");
      out.write("          document.getElementById(icon_name).style.color=\"red\"; \r\n");
      out.write("       }\r\n");
      out.write("       else\r\n");
      out.write("       {\r\n");
      out.write("             document.getElementById(icon_name).className=\"fa fa-check\";\r\n");
      out.write("             document.getElementById(icon_name).style.visibility=\"visible\";\r\n");
      out.write("        document.getElementById(icon_name).style.color=\"green\"; \r\n");
      out.write("        }\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("     <div class=\"wrapper fadeInDown\">\r\n");
      out.write("  <div id=\"formContent\">\r\n");
      out.write("    <!-- Tabs Titles -->\r\n");
      out.write("    <h2 class=\"active\"> Sign In </h2>\r\n");
      out.write("    <h2 class=\"inactive underlineHover\">Sign Up </h2>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Login Form -->\r\n");
      out.write("    <form id=\"form1\">\r\n");
      out.write("        <div class=\"container ml-2\"  >\r\n");
      out.write("           <div class=\"form-row \">\r\n");
      out.write("               <div class=\"col-sm-6 \"  >\r\n");
      out.write("                   <input type=\"text\" id=\"firstname\" class=\" fadeIn second \" name=\"firstname\" placeholder=\"First Name\" onkeyup=\"go1()\"><i   id=\"icon_firstname\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("                   </div>\r\n");
      out.write("               <div class=\"col-sm-6\">\r\n");
      out.write("                   <input type=\"text\" id=\"lastname\" class=\"fadeIn second \" name=\"lastname\" placeholder=\"Lastname\" onkeyup=\"go2()\"><i id=\"icon_lastname\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("               </div>    \r\n");
      out.write("               </div>\r\n");
      out.write("               </div>\r\n");
      out.write("                   \r\n");
      out.write("        \r\n");
      out.write("      <input type=\"text\" id=\"username\" class=\"fadeIn second   \" name=\"username\" placeholder=\"Enter Username\" onkeyup=\"go3()\"><i  id=\"icon_username\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("      <input type=\"text\" id=\"mail\" class=\"fadeIn third \" name=\"mail\" placeholder=\"Enter E-mail\" onkeyup=\"go4()\"> <i  id=\"icon_mail\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("      <input type=\"password\" id=\"password\" class=\"fadeIn third \" name=\"password\" placeholder=\"Enter password\" onkeyup=\"go5()\"><i id=\"icon_password\" class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("      <input type=\"text\" id=\"mobile\" class=\"fadeIn third \" name=\"mobile\" placeholder=\"Enter mobile\" onkeyup=\"go6()\"><i id=\"icon_mobile\"  class=\"fa fa-check\" style=\"visibility: hidden\"></i> \r\n");
      out.write("      \r\n");
      out.write("       <div class=\"container ml-1  my-3  mt-sm-4 \">\r\n");
      out.write("            <label class=\"radio-inline container1 fadeIn third\">\r\n");
      out.write("                <input type=\"radio\" name=\"radio1\" value=\"male\" checked>Male\r\n");
      out.write("        <span class=\"checkmark fadeIn third\"></span>\r\n");
      out.write("    </label>\r\n");
      out.write("   \r\n");
      out.write("       <label class=\"radio-inline container1 fadeIn third\">\r\n");
      out.write("      <input type=\"radio\" name=\"radio1\" value=\"female\" checked>Female\r\n");
      out.write("        <span class=\"checkmark fadeIn third\"></span>\r\n");
      out.write("    </label>\r\n");
      out.write("           \r\n");
      out.write("           <label class=\"radio-inline container1 fadeIn third\">\r\n");
      out.write("               <input type=\"radio\" name=\"radio1\" value=\"others\" checked>Others\r\n");
      out.write("        <span class=\"checkmark fadeIn third\"></span>\r\n");
      out.write("    </label>\r\n");
      out.write("       \r\n");
      out.write("       </div>\r\n");
      out.write("              \r\n");
      out.write("      <div class=\"container-fluid mt-lg-4 \">\r\n");
      out.write("          <input type=\"button\" class=\"fadeIn fourth pdt-4\" value=\"Sign Up\" onclick=\"go()\" name=\"submitbtn\">\r\n");
      out.write("      </div>\r\n");
      out.write("   </form>\r\n");
      out.write("    <!-- Remind Passowrd -->\r\n");
      out.write("    <div id=\"formFooter\">\r\n");
      out.write("      <a class=\"underlineHover\" href=\"#\">Forgot Password?</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
