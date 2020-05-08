<%-- 
    Document   : EnterOtp
    Created on : May 2, 2020, 2:08:44 PM
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
<script src="EnterOtp.js" type="text/javascript"></script>        

<style>
    body {
  font-family: "Poppins", sans-serif;
  height: 100vh;
  background-image: linear-gradient(45deg, rgba(213, 15, 61, 0.6), rgba(13, 17, 198, 0.69) 100%);
}
    </style>


        <title>JSP Page</title>
      <body id="body">
          
          
          <div class="container" >
  
            <div class="modal " id="otpModal" role="dialog" >
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
           <h4 class="h4 " >Enter OTP below that is sent on your email</h4>
           </div>
           
          <div class="d-flex justify-content-center mt-3">
                <input   type="text" maxlength="1" size="1"  id="1" class="m-1 "  >
               <input type="text" maxlength="1" size="1"   id="2" class="m-1"  >
                <input type="text" maxlength="1" size="1"      id="3"  class="m-1"  >
                <input type="text" maxlength="1" size="1"   id="4"  class="m-1">
                <input type="text" maxlength="1" size="1"  id="5" class="m-1">
                  <input type="text" maxlength="1" size="1"   id="6"     class="m-1">
         </div>
  
            <!--button-->
<div class="d-flex justify-content-center mt-3 mb-3">
    <input type="button" class="btn btn-outline-primary btn-lg" value="Confirm OTP"  onclick="confirmOtp()"  />
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
