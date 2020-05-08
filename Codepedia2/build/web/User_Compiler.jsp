<%-- 
    Document   : PublicCompiler
    Created on : May 3, 2020, 6:58:56 PM
    Author     : PARAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
 <link href="lib/codemirror.css" rel="stylesheet" type="text/css"/>
        <script src="lib/codemirror.js" type="text/javascript"></script>
        <script src="addon/edit/closebrackets.js" type="text/javascript"></script>
        <script src="mode/clike/clike.js" type="text/javascript"></script>
        <script src="addon/hint/show-hint.js" type="text/javascript"></script>
        <script src="addon/edit/matchbrackets.js" type="text/javascript"></script>
        <link href="addon/hint/show-hint.css" rel="stylesheet" type="text/css"/>     
        <link href="theme/mdn-like.css" rel="stylesheet" type="text/css"/>
        <link href="theme/dracula.css" rel="stylesheet" type="text/css"/>
        <link href="theme/cobalt.css" rel="stylesheet" type="text/css"/>
          <title>JSP Page</title>
        <script>
            function go()
            {
                document.getElementById("outputarea").className="slider";  
            }
         
            var editor;
              function setStyle()
            {
                editor = CodeMirror.fromTextArea(document.getElementById("codearea"),
                        {
                            lineNumbers: true,
                            matchBrackets: true,
                            autoCloseBrackets: true,
                             theme: "cobalt",
                           
                            extraKeys: {"Ctrl-Space": "autocomplete"},
                            highlightSelectionMatches: true,
                            mode: "text/x-csrc"
                        });
               editor.on('change', function () {
                    document.getElementById("runbtn").disabled = true;
                      document.getElementById("savebtn").disabled = true;
                  
                });
            }

             
             
            function readandpreview(fileobj, preview)
            {
                var firstfile = fileobj.files[0];
                var reader = new FileReader();
                reader.onload = (function (f)
                {
                    return function read(e)
                    {
                        editor.setValue(e.target.result);
                    };
                })(firstfile);
                reader.readAsText(firstfile);
            }

            function filesaving()
            {
                var lang = document.getElementById("language").value;
                var code = editor.getValue();
               
                console.log("lang " + lang);
                console.log("code : " + code);
                if (code == "")
                {
                    alert("Please write some code");
                } else
                {
                    var xhr = new XMLHttpRequest();
                    var formdata = new FormData();
                    formdata.append("lang", lang);
                    formdata.append("code", code);
                    document.getElementById("compile_spinner").style.display="inline-block";
                    document.getElementById("compile_icon").style.display="none";
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState == 4 && xhr.status == 200)
                        {
                                var resp = xhr.responseText.trim();
                                if(resp=="success")
                                {
                                    compile();
                                }
                                else
                                {
                                    alert("some error occur");
                                }
                        }
                    };
                    xhr.open("POST", "./User_File_Save", true);
                    xhr.send(formdata);
                }

            }
            function compile()
            {
                var lang = document.getElementById("language").value;
                var xhr = new XMLHttpRequest();
                xhr.onreadystatechange =  function()
                {
                  if(xhr.readyState==4 && xhr.status==200)
                  {
                      var resp = xhr.responseText.trim();
                      
            document.getElementById("outputarea").value ="Output is "+ resp;          
            document.getElementById("outputarea").className="slider";  
               document.getElementById("compile_spinner").style.display="none";
                    document.getElementById("compile_icon").style.display="inline-block";
                      document.getElementById("runbtn").disabled=false;
                        document.getElementById("savebtn").disabled=false;
                      
                  }
                };
                xhr.open("GET","./User_Compiler?lang=" + lang,true);
                xhr.send();
            }

         function run()
         {
            
             var lang=document.getElementById("language").value;
             var input=document.getElementById("inputarea").value;
             var xhr=new XMLHttpRequest();
             xhr.onreadystatechange=function()
             {
                 if(xhr.readyState==4 && xhr.status==200)
                 {
                     var res=xhr.responseText.trim();
                     document.getElementById("outputarea").value="Output is"+res;
                 }
             };
             xhr.open("GET","./UserRun?lang="+lang+"&input="+input,true);
             xhr.send();
         }
      
      function changetheme()
      {
          var choice=document.getElementById("theme").value;
          if(choice==="blue")
          {
              editor.setOption("theme","cobalt");
          }
          else if(choice==="night")
          {
              editor.setOption("theme","dracula");
          }
          else if(choice==="light")
          {
               editor.setOption("theme","mdn-like");
          }  
    }
       
       function fontinc()
       {
           var val=document.getElementById("slide").value;
            val=val/100; 
            val=val*60;
            console.log(val);
            editor.getWrapperElement().style["font-size"] = val+"px";
              editor.refresh(); 
    }
       function savefile()
           {
           var lang=document.getElementById("language").value;
           var title=document.getElementById("title").value;
           if(title==null||title=="")
           {
               alert("Please type some title");
           }
           if(title!="")
           {
                   
            var xhr=new XMLHttpRequest();
            xhr.onreadystatechange=function(){
                if(xhr.readyState==4 && xhr.status==200)
                {
                    var res=xhr.responseText.trim();
                    if(res==="fail")
                    {
                        alert("Same title already exist");
                    }
                    else if(res==="success")
                    {
                        alert("Code Saved");
                    }
                    else
                    {
                        alert(res);
                    }
                }
            };
            xhr.open("GET","./SaveFile?lang="+lang+"&title="+title,true);
            xhr.send();
           }
       }

       
            </script> 
            <style>

                .CodeMirror {
                border: 1px solid #eee;
                height: 600px;
                 font-family:monospace;
               font-size: 16px;            
}

               
        
    #codearea
    {
        resize:none;     
       height:600px;
       width:100%;
       
        }
        
        .slider
        {
           color:white;
         background-color:  #002240 ;
            animation-duration: 2s;
        animation-name: slider;
        animation-timing-function: ease-out;
       
        }
        
        #outputarea
        {
            resize:none;
            height:450px;
            width:100%;
         border:none;
         border-top:2px solid black;
            
    }
@keyframes slider
{
    0%{height:0px;}
    100%{height:450px;}
 
}

        
        
      </style>
    
    </head>
    <body  onload="setStyle()">
        
        <jsp:include page="navbar.jsp"/>
        
       <div class="container-fluid" >
          
           <div class="row">
           
               <div class=" col-md-8 p-sm-5 p-2 ">
          <!--Div containing buttons above text editor-->
               
          <div  style="border:1px solid black; " class=" d-flex flex-column p-3">
              <div class="d-flex flex-row">
                  
              <select class="form-control form-control-sm ml-2 mb-3" id="language" style="max-width:30%">
                  <option selected value="c">C</option>
                  <option value="cpp">C++</option>
                  <option value="java">Java</option>
                  <option value="python">Python</option>
               </select>
                  
                <select class="form-control form-control-sm ml-2 mb-3" id="theme" style="max-width:20%" onchange="changetheme()">
                  <option selected value="blue">Dark-blue</option>
                  <option value="night">nightmare</option>
                  <option value="light">light</option>
               </select>
                  
                 <div class="input-group mb-3 input-group-sm ml-3">
                      <div class="input-group-prepend">
                       <span class="input-group-text">Title</span>
                        </div>
                     <input type="text" class="form-control" id="title">
                   </div>
                  
                     <input type="range" class="custom-range ml-2" name="range" style="max-width: 10%" id="slide" oninput="fontinc()">
                  
                  
              </div>
                <textarea  id="codearea"  ></textarea>
         </div>
          
          
          
          
                       <!--Text editor-->       
                 
                 
          <div class="d-flex p-3" style="border:1px solid black;">
       <!--Customized file choser button-->
                     <div class=" mr-auto ">
                         <label class="btn btn-primary btn-lg">Upload
                          <input   type="file" id="choser" onchange="readandpreview(this, 'codearea')" accept=".py,.java,.c,.cpp" style="display: none"><i class="fas fa-cloud-upload-alt ml-1"></i>
                         </label>
                         
                      <!--   <label class="btn btn-primary btn-lg ml-3">Save
                          <input   type="button" id="savebtn" onclick="savefile()"  style disabled="disabled"><i class="fas fa-save ml-1" ></i>
                         </label>-->
                       <button type="button" class="btn btn-primary btn-lg mb-2 ml-3" onclick="savefile()" id="savebtn" disabled >Save<i class="fas fa-save ml-1" ></i></button>
                         
                     </div>
       <div class="mr-3"><button type="button" class="btn btn-primary  btn-lg" id="compilebtn" onclick="filesaving()">Compile<i class="fas fa-code ml-1" id="compile_icon"></i><span class="spinner-border spinner-border-sm mb-1 ml-1 " style="display:none" id="compile_spinner"></span></button></div>
       <div class= mr-2"><button type="button" class="btn btn-primary btn-lg" style="width:140px" onclick="run()" id="runbtn" disabled >Run</button></div>
         </div>
              
           </div>
               
               <!--Output div-->
             <div class=" col-md-4 col-12 p-sm-5 p-2"  >
                    <div   class="p-sm-2 p-0"><h3>Input:</h3></div>
                   <textarea class="form-control" rows="6" id="inputarea" name="inputarea" ></textarea>    
                 <div   class="p-sm-2 p-0"><h3 class="mt-4">Compile Info:</h3></div>
                  <textarea   id="outputarea" > </textarea>
                  
             </div>
          </div>
       </div>
    
    </body>
</html>
