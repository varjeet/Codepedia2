<%-- 
    Document   : NewPassword
    Created on : May 2, 2020, 4:13:38 PM
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
<link href="Signup.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script src="NewPassword.js" type="text/javascript"></script>
   
        
        
        
        <title>JSP Page</title>
    </head>
    <body id="body">
        <%
        String mail= request.getParameter("mail");
        %>
        <input type="hidden" id="mail" value="<%=mail%>" />
        
       <div class="container" >
  
  <div class="modal " id="passwordModal" role="dialog" >
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
           <h3 class="h3 font-weight-bold" >Create new password</h3>
           </div>
           
           <div class="d-flex justify-content-center mt-3"> 
          <input type="text" id="newpassword"  name="newpassword" placeholder="Enter new password" onkeyup="go2()"><i  id="icon_newpassword" class="fa fa-check" style="visibility: hidden"></i> 
           </div>
           

           <div class="d-flex justify-content-center mt-3">
           <input type="text" id="confirmpassword"  name="confirmpassword" placeholder="Re-enter new password" onkeyup="go3()"> <i  id="icon_confirmpassword" class="fa fa-check" style="visibility: hidden"></i> 
           </div>
       </div>
           
            <!--button-->
<div class="d-flex justify-content-center mt-3">
    <input type="button" class="btn btn-outline-primary btn-lg "   value="Create Password"  onclick="go()"  />
    </div>
   
      <!--button-->
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
    </body>
</html>
