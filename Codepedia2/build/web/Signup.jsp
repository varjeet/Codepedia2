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
<script src="Signup.js" type="text/javascript"></script>
<link href="Signup.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script>
 function go1()
    {
      design("firstname","icon_firstname");
    }
    
    function go2()
    {
        design("lastname","icon_lastname");
      
    }
     function go3()
    {
        design("username","icon_username");
      
    }
     function go4()
    {
        design("mail","icon_mail");
      
    }
     function go5()
    {
        design("password","icon_password");
      
    }
     function go6()
    {
        design("mobile","icon_mobile");
      
    }
     function design(input_name,icon_name)
     {
         var text=document.getElementById(input_name).value;
       if(text==="")
       {
           document.getElementById(icon_name).className="fa fa-times";
           document.getElementById(icon_name).style.visibility="visible";
          document.getElementById(icon_name).style.color="red"; 
       }
       else
       {
             document.getElementById(icon_name).className="fa fa-check";
             document.getElementById(icon_name).style.visibility="visible";
        document.getElementById(icon_name).style.color="green"; 
        }
         
     }
    
    
    </script>
    
    </head>
    <body>
     <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Sign In </h2>
    <h2 class="inactive underlineHover">Sign Up </h2>

    

    <!-- Login Form -->
    <form id="form1">
        <div class="container ml-2"  >
           <div class="form-row ">
               <div class="col-sm-6 "  >
                   <input type="text" id="firstname" class=" fadeIn second " name="firstname" placeholder="First Name" onkeyup="go1()"><i   id="icon_firstname" class="fa fa-check" style="visibility: hidden"></i> 
                   </div>
               <div class="col-sm-6">
                   <input type="text" id="lastname" class="fadeIn second " name="lastname" placeholder="Lastname" onkeyup="go2()"><i id="icon_lastname" class="fa fa-check" style="visibility: hidden"></i> 
               </div>    
               </div>
               </div>
                   
        
      <input type="text" id="username" class="fadeIn second   " name="username" placeholder="Enter Username" onkeyup="go3()"><i  id="icon_username" class="fa fa-check" style="visibility: hidden"></i> 
      <input type="text" id="mail" class="fadeIn third " name="mail" placeholder="Enter E-mail" onkeyup="go4()"> <i  id="icon_mail" class="fa fa-check" style="visibility: hidden"></i> 
      <input type="password" id="password" class="fadeIn third " name="password" placeholder="Enter password" onkeyup="go5()"><i id="icon_password" class="fa fa-check" style="visibility: hidden"></i> 
      <input type="text" id="mobile" class="fadeIn third " name="mobile" placeholder="Enter mobile" onkeyup="go6()"><i id="icon_mobile"  class="fa fa-check" style="visibility: hidden"></i> 
      
       <div class="container ml-1  my-3  mt-sm-4 ">
            <label class="radio-inline container1 fadeIn third">
                <input type="radio" name="radio1" value="male" checked>Male
        <span class="checkmark fadeIn third"></span>
    </label>
   
       <label class="radio-inline container1 fadeIn third">
      <input type="radio" name="radio1" value="female" checked>Female
        <span class="checkmark fadeIn third"></span>
    </label>
           
           <label class="radio-inline container1 fadeIn third">
               <input type="radio" name="radio1" value="others" checked>Others
        <span class="checkmark fadeIn third"></span>
    </label>
       
       </div>
              
      <div class="container-fluid mt-lg-4 ">
          <input type="button" class="fadeIn fourth pdt-4" value="Sign Up" onclick="go()" name="submitbtn">
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
