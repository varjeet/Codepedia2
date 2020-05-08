package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PublicCompiler_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write(" <link href=\"lib/codemirror.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"lib/codemirror.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"addon/edit/closebrackets.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"mode/clike/clike.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"addon/hint/show-hint.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"addon/edit/matchbrackets.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"addon/hint/show-hint.css\" rel=\"stylesheet\" type=\"text/css\"/>     \n");
      out.write("        <link href=\"theme/mdn-like.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"theme/dracula.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"theme/cobalt.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function go()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"outputarea\").className=\"slider\";  \n");
      out.write("            }\n");
      out.write("         \n");
      out.write("            var editor;\n");
      out.write("              function setStyle()\n");
      out.write("            {\n");
      out.write("                editor = CodeMirror.fromTextArea(document.getElementById(\"codearea\"),\n");
      out.write("                        {\n");
      out.write("                            lineNumbers: true,\n");
      out.write("                            matchBrackets: true,\n");
      out.write("                            autoCloseBrackets: true,\n");
      out.write("                             theme: \"mdn-like\",\n");
      out.write("                           \n");
      out.write("                            extraKeys: {\"Ctrl-Space\": \"autocomplete\"},\n");
      out.write("                            highlightSelectionMatches: true,\n");
      out.write("                            mode: \"text/x-csrc\"\n");
      out.write("                        });\n");
      out.write("               editor.on('change', function () {\n");
      out.write("                    document.getElementById(\"runbtn\").disabled = true;\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            function readandpreview(fileobj, preview)\n");
      out.write("            {\n");
      out.write("                var firstfile = fileobj.files[0];\n");
      out.write("                var reader = new FileReader();\n");
      out.write("                reader.onload = (function (f)\n");
      out.write("                {\n");
      out.write("                    return function read(e)\n");
      out.write("                    {\n");
      out.write("                        editor.setValue(e.target.result);\n");
      out.write("                    };\n");
      out.write("                })(firstfile);\n");
      out.write("                reader.readAsText(firstfile);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function filesaving()\n");
      out.write("            {\n");
      out.write("                var lang = document.getElementById(\"language\").value;\n");
      out.write("                var code = editor.getValue();\n");
      out.write("               \n");
      out.write("                console.log(\"lang \" + lang);\n");
      out.write("                console.log(\"code : \" + code);\n");
      out.write("                if (code == \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please write some code\");\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    var xhr = new XMLHttpRequest();\n");
      out.write("                    var formdata = new FormData();\n");
      out.write("                    formdata.append(\"lang\", lang);\n");
      out.write("                    formdata.append(\"code\", code);\n");
      out.write("                    document.getElementById(\"compile_spinner\").style.display=\"inline-block\";\n");
      out.write("                    document.getElementById(\"compile_icon\").style.display=\"none\";\n");
      out.write("                    xhr.onreadystatechange = function ()\n");
      out.write("                    {\n");
      out.write("                        if (xhr.readyState == 4 && xhr.status == 200)\n");
      out.write("                        {\n");
      out.write("                                var resp = xhr.responseText.trim();\n");
      out.write("                                if(resp==\"success\")\n");
      out.write("                                {\n");
      out.write("                                    compile();\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    alert(\"some error occur\");\n");
      out.write("                                }\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    xhr.open(\"POST\", \"./Public_File_Save\", true);\n");
      out.write("                    xhr.send(formdata);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function compile()\n");
      out.write("            {\n");
      out.write("                var lang = document.getElementById(\"language\").value;\n");
      out.write("                var xhr = new XMLHttpRequest();\n");
      out.write("                xhr.onreadystatechange =  function()\n");
      out.write("                {\n");
      out.write("                  if(xhr.readyState==4 && xhr.status==200)\n");
      out.write("                  {\n");
      out.write("                      var resp = xhr.responseText.trim();\n");
      out.write("                      \n");
      out.write("            document.getElementById(\"outputarea\").value =\"Output is \"+ resp;          \n");
      out.write("            document.getElementById(\"outputarea\").className=\"slider\";  \n");
      out.write("               document.getElementById(\"compile_spinner\").style.display=\"none\";\n");
      out.write("                    document.getElementById(\"compile_icon\").style.display=\"inline-block\";\n");
      out.write("                      document.getElementById(\"runbtn\").disabled=false;\n");
      out.write("                      \n");
      out.write("                  }\n");
      out.write("                };\n");
      out.write("                xhr.open(\"GET\",\"./Public_Compiler?lang=\" + lang,true);\n");
      out.write("                xhr.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("         function run()\n");
      out.write("         {\n");
      out.write("            \n");
      out.write("             var lang=document.getElementById(\"language\").value;\n");
      out.write("             var input=document.getElementById(\"inputarea\").value;\n");
      out.write("             var xhr=new XMLHttpRequest();\n");
      out.write("             xhr.onreadystatechange=function()\n");
      out.write("             {\n");
      out.write("                 if(xhr.readyState==4 && xhr.status==200)\n");
      out.write("                 {\n");
      out.write("                     var res=xhr.responseText.trim();\n");
      out.write("                     document.getElementById(\"outputarea\").value=\"Output is\"+res;\n");
      out.write("                 }\n");
      out.write("             };\n");
      out.write("             xhr.open(\"GET\",\"./Public_Run1?lang=\"+lang+\"&input=\"+input,true);\n");
      out.write("             xhr.send();\n");
      out.write("         }\n");
      out.write("      \n");
      out.write("      function changetheme()\n");
      out.write("      {\n");
      out.write("          var choice=document.getElementById(\"theme\").value;\n");
      out.write("          if(choice===\"blue\")\n");
      out.write("          {\n");
      out.write("              editor.setOption(\"theme\",\"cobalt\");\n");
      out.write("          }\n");
      out.write("          else if(choice===\"night\")\n");
      out.write("          {\n");
      out.write("              editor.setOption(\"theme\",\"dracula\");\n");
      out.write("          }\n");
      out.write("          else if(choice===\"light\")\n");
      out.write("          {\n");
      out.write("               editor.setOption(\"theme\",\"mdn-like\");\n");
      out.write("          }  \n");
      out.write("    }\n");
      out.write("       \n");
      out.write("       function fontinc()\n");
      out.write("       {\n");
      out.write("           var val=document.getElementById(\"slide\").value;\n");
      out.write("            val=val/100; \n");
      out.write("            val=val*34;\n");
      out.write("            console.log(val);\n");
      out.write("            editor.getWrapperElement().style[\"font-size\"] = val+\"px\";\n");
      out.write("              editor.refresh(); \n");
      out.write("    }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("            </script> \n");
      out.write("            <style>\n");
      out.write("\n");
      out.write("                .CodeMirror {\n");
      out.write("                border: 1px solid #eee;\n");
      out.write("                height: 600px;\n");
      out.write("                 font-family:monospace;\n");
      out.write("               font-size: 16px;            \n");
      out.write("}\n");
      out.write("\n");
      out.write("               \n");
      out.write("        \n");
      out.write("    #codearea\n");
      out.write("    {\n");
      out.write("        resize:none;     \n");
      out.write("       height:600px;\n");
      out.write("       width:100%;\n");
      out.write("       \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .slider\n");
      out.write("        {\n");
      out.write("           color:white;\n");
      out.write("         background-color:  #002240 ;\n");
      out.write("            animation-duration: 2s;\n");
      out.write("        animation-name: slider;\n");
      out.write("        animation-timing-function: ease-out;\n");
      out.write("       \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #outputarea\n");
      out.write("        {\n");
      out.write("            resize:none;\n");
      out.write("            height:450px;\n");
      out.write("            width:100%;\n");
      out.write("         border:none;\n");
      out.write("         border-top:2px solid black;\n");
      out.write("            \n");
      out.write("    }\n");
      out.write("@keyframes slider\n");
      out.write("{\n");
      out.write("    0%{height:0px;}\n");
      out.write("    100%{height:450px;}\n");
      out.write(" \n");
      out.write("}\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body  onload=\"setStyle()\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("       <div class=\"container-fluid\" >\n");
      out.write("          \n");
      out.write("           <div class=\"row\">\n");
      out.write("           \n");
      out.write("               <div class=\" col-md-8 p-sm-5 p-2 \">\n");
      out.write("          <!--Div containing buttons above text editor-->\n");
      out.write("               \n");
      out.write("          <div  style=\"border:1px solid black; \" class=\" d-flex flex-column p-3\">\n");
      out.write("              <div class=\"d-flex flex-row\">\n");
      out.write("                  \n");
      out.write("              <select class=\"form-control form-control-sm ml-2 mb-3\" id=\"language\" style=\"max-width:30%\">\n");
      out.write("                  <option selected value=\"c\">C</option>\n");
      out.write("                  <option value=\"cpp\">C++</option>\n");
      out.write("                  <option value=\"java\">Java</option>\n");
      out.write("                  <option value=\"python\">Python</option>\n");
      out.write("               </select>\n");
      out.write("                  \n");
      out.write("                <select class=\"form-control form-control-sm ml-2 mb-3\" id=\"theme\" style=\"max-width:20%\" onchange=\"changetheme()\">\n");
      out.write("                  <option selected value=\"blue\">Dark-blue</option>\n");
      out.write("                  <option value=\"night\">nightmare</option>\n");
      out.write("                  <option value=\"light\">light</option>\n");
      out.write("               </select>\n");
      out.write("                  \n");
      out.write("                  <input type=\"range\" class=\"form-control-range\" name=\"range\" style=\"max-width: 10%\" id=\"slide\" oninput=\"fontinc()\">\n");
      out.write("              </div>\n");
      out.write("                <textarea  id=\"codearea\"  ></textarea>\n");
      out.write("         </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("                       <!--Text editor-->       \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("          <div class=\"d-flex p-3\" style=\"border:1px solid black;\">\n");
      out.write("       <!--Customized file choser button-->\n");
      out.write("                     <div class=\" mr-auto \">\n");
      out.write("                         <label class=\"btn btn-primary btn-lg\">Upload\n");
      out.write("                          <input   type=\"file\" id=\"choser\" onchange=\"readandpreview(this, 'codearea')\" accept=\".py,.java,.c,.cpp\" style=\"display: none\"><i class=\"fas fa-cloud-upload-alt ml-1\"></i>\n");
      out.write("                         </label>\n");
      out.write("                     </div>\n");
      out.write("       <div class=\"mr-3\"><button type=\"button\" class=\"btn btn-primary  btn-lg\" id=\"compilebtn\" onclick=\"filesaving()\">Compile<i class=\"fas fa-code ml-1\" id=\"compile_icon\"></i><span class=\"spinner-border spinner-border-sm mb-1 ml-1 \" style=\"display:none\" id=\"compile_spinner\"></span></button></div>\n");
      out.write("       <div class= mr-2\"><button type=\"button\" class=\"btn btn-primary btn-lg\" style=\"width:140px\" onclick=\"run()\" id=\"runbtn\" disabled >Run</button></div>\n");
      out.write("         </div>\n");
      out.write("              \n");
      out.write("           </div>\n");
      out.write("               \n");
      out.write("               <!--Output div-->\n");
      out.write("             <div class=\" col-md-4 col-12 p-sm-5 p-2\"  >\n");
      out.write("                    <div   class=\"p-sm-2 p-0\"><h3>Input:</h3></div>\n");
      out.write("                   <textarea class=\"form-control\" rows=\"6\" id=\"inputarea\" name=\"inputarea\" ></textarea>    \n");
      out.write("                 <div   class=\"p-sm-2 p-0\"><h3 class=\"mt-4\">Compile Info:</h3></div>\n");
      out.write("                  <textarea   id=\"outputarea\" > </textarea>\n");
      out.write("                  \n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("       </div>\n");
      out.write("    \n");
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