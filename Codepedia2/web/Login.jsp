<%-- 
    Document   : Signup
    Created on : Apr 27, 2020, 3:58:31 PM
    Author     : PARAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link href="Signup.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="Login.js" type="text/javascript"></script>
<script>

function sendotp()
{
             var xhr = new XMLHttpRequest;
                    var mail=document.getElementById("modal_mail").value;
                    console.log(mail);
                      var formdata=new FormData();
                   formdata.append("mail",mail);
                 
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                           
                             if(res=== "success")
                            {
                               alert("A mail has been sent to your email");
                                window.location.href="EnterOtp.jsp";
                            }
                            else
                            {
                                   alert("Error Occured sending Otp");      
                            }
                        }
                    };
                    
                    xhr.open("POST","./RecoverPassword", true);
                    
                    //alert("Check Console Log");
                    
                  //  console.log(formdata);
                    xhr.send(formdata);
    }

</script>





    </head>
    <body style="background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff)">
     <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Sign In </h2>
    <h2 class="inactive underlineHover">Sign Up </h2>

    

    <!-- Login Form -->
    <form id="form1">
   <!-- <input type="text" id="mail" class="fadeIn third " name="mail" placeholder="Enter E-mail" onkeyup="go4()"> <i  id="icon_mail" class="fa fa-check" style="visibility: hidden"></i>-->
     <input type="text" id="username" class="fadeIn second   " name="username" placeholder="Enter Username" onkeyup="go3()"><i  id="icon_username" class="fa fa-check" style="visibility: hidden"></i> 
      <input type="password" id="password" class="fadeIn third " name="password" placeholder="Enter password" onkeyup="go5()"><i id="icon_password" class="fa fa-check" style="visibility: hidden"></i> 
   <!--   <input type="text" id="mobile" class="fadeIn third " name="mobile" placeholder="Enter mobile" onkeyup="go6()"><i id="icon_mobile"  class="fa fa-check" style="visibility: hidden"></i> -->
      
              
      <div class="container-fluid mt-lg-4 ">
          <input type="button" class="fadeIn fourth pdt-4" value="Log In" onclick="go()" name="submitbtn">
      </div>
   </form>

   
   <!-- Forgot Passowrd -->
    <div id="formFooter">
       <a href="#"    class="underlineHover" data-toggle="modal" data-target="#emailModal"  >Forgot Password?</a>
    </div>
  </div>
</div>
        
        
        <!--Modal for emial otp named email modal-->
        <div class="container" >
  
  <div class="modal fade" id="emailModal" role="dialog" >
    <div class="modal-dialog" >
    
      <!-- Modal content-->
      <div class="modal-content" style="background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff) ">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"></h4>
        </div>
        <div class="modal-body">
            <!--Design-->
           
       <div class="d-flex flex-column">
           
           <!--    <img class="rounded" src="myuploads/lock.png" style="height: auto;width: 100%">-->
           <div class="d-flex justify-content-center">
           <img class="rounded img-fluid ml-5" src="myuploads/lock.png" style="width: 200px;height: 200px">
           </div>
          
           <div class="d-flex justify-content-center mt-3"> 
           <h3 class="h3 font-weight-bold" >Forgot Password?</h3>
           </div>
           
           <div class="d-flex justify-content-center mt-3"> 
           <h5 class="h5" >Enter Email to get one time password(OTP)</h5>
           </div>
           

           <div class="d-flex justify-content-center mt-3">
           <input type="text" placeholder="Enter mai" id="modal_mail" name="modal_mail">    
           </div>
       </div>
           
            <!--button-->
<div class="d-flex justify-content-center mt-3">
    <input type="button" class="btn btn-outline-primary btn-lg "   value="Send OTP"  onclick="sendotp()"  />
    </div>
   
      <!--button-->
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
        
        
        
        
        
        
        
    </body>
</html>
