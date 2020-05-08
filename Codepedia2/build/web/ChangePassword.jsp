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
<script src="ChangePassword.js" type="text/javascript"></script>
<link href="Signup.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

    
    </head>
    <body>
     <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Sign In </h2>
    <h2 class="inactive underlineHover">Sign Up </h2>

    

    <!-- Login Form -->
    <form id="form1">
        
                   
      <input type="password" id="oldpassword" class="fadeIn third " name="oldpassword" placeholder="Enter current password" onkeyup="go1()"><i id="icon_oldpassword" class="fa fa-check" style="visibility: hidden"></i>    
      <input type="text" id="newpassword" class="fadeIn second   " name="newpassword" placeholder="Enter new password" onkeyup="go2()"><i  id="icon_newpassword" class="fa fa-check" style="visibility: hidden"></i> 
      <input type="text" id="confirmpassword" class="fadeIn third " name="confirmpassword" placeholder="Re-enter new password" onkeyup="go3()"> <i  id="icon_confirmpassword" class="fa fa-check" style="visibility: hidden"></i> 
     
      
              
      <div class="container-fluid mt-lg-4 ">
          <input type="button" class="fadeIn fourth pdt-4" value="Change" onclick="go()" name="submitbtn">
      </div>
   </form>
    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
    </body>
</html>
