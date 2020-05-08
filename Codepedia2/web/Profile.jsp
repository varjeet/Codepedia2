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
<script src="Profile.js" type="text/javascript"></script>







        <title>JSP Page</title>
    </head>
    <body onload="fetch()">
        <div class="container-fluid" style="background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff) ">
     
            <div class="row">
            <div class="col-sm-7 col-12 p-5" >
                
                <div class="col-sm-12 p-5" >
                    <h1       id="firstname"     name="firstname"      class="font-weight-bold  text-left display-1" >Va</h1>
                    
                     <h1       id="lastname"     name="lastname"      class="font-weight-bold display-1 text-left">Va</h1>
                  <h4 class="mt-5" id="description">Description here</h4>
                </div>
                   
                
               
                    <div class="col-sm-12 col-12 p-5" >
                  
                        <!--update profile open modal-->
                        
                        <div class="row ">
                       <h1 class="h1"  >General Info</h1>
                       <a  class=" ml-5 mt-3" href="#" data-toggle="tooltip" data-placement="top" title="Update profile!" ><i class="fas fa-pencil-alt" data-toggle="modal" data-target="#ProfileModal"></i></a>
                    
                            </div>
                        <script>
$(document).ready(function(){
  $('[data-toggle="tooltip"]').tooltip();   
});
</script>

                     <!---->
                       
                            <div class="row">
                                 <div class="col-3 ">
                                         <h4 class="mt-4">Username</h4>
                                 </div>
                                <div class="col-6">
                                        <h4 class="mt-4" name="username" id="username">V</h4>
                                 </div>
                           </div>
                        
                              <div class="row">
                                 <div class="col-sm-3">
                                         <h4 class="mt-4">E-mail</h4>
                                 </div>
                                <div class="col-sm-6">
                                        <h4 class="mt-4" name="mail" id="mail">res</h4>
                                 </div>
                           </div>
                        
                              <div class="row">
                                 <div class="col-sm-3">
                                         <h4 class="mt-4">Mobile</h4>
                                 </div>
                                <div class="col-sm-6">
                                        <h4 class="mt-4" name="mobile" id="mobile">843</h4>
                                         
                                 </div>
                           </div>
                        
                           
                        </div>
                 </div>
                
            <!--Profile Picture link-->
    
            <div class="col-sm-5 col-12 p-2" >
                <div class="col-sm-12 col-12 p-5 mt-5" >
             <a href="#"     data-toggle="modal" data-target="#PictureModal"  >  <img class="img-fluid rounded-circle"  alt="" name="photo" id="photo" style="height:auto;width: 100%"  data-toggle="tooltip" data-placement="top" title="Update profile Picture!"/></a>
                </div>
            </div>
         </div>
    </div>
        
        
        
        <!--Modal for profile picture-->
 <div class="container" >
  
  <div class="modal fade" id="PictureModal" role="dialog" >
    <div class="modal-dialog" >
    
      <!-- Modal content-->
      <div class="modal-content" style="background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff) ">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"></h4>
        </div>
        <div class="modal-body">
            
            <img class="img-fluid rounded-circle" alt="no privew available" name="modalphoto" id="modalphoto" style="height:auto;width: 100%"/>
      
            <!--button-->
            
  <div class="custom-file mt-3" >
      <input type="file" class="custom-file-input" id="dp_choser" name="dp_choser" accept="image/jpeg,image/png,image/jpg"  > 
    <label class="custom-file-label" for="customFile">Choose file</label>
  </div>
<script>
// Add the following code if you want the name of the file appear on select
$(".custom-file-input").on("change", function() {
  var fileName = $(this).val().split("\\").pop();
  $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
});
</script>
<div class="d-flex justify-content-center mt-3">
    <input type="submit" class="btn btn-outline-primary" value="Upload"  onclick="changePic()" class="close" data-dismiss="modal" />
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
        <!--Modal-->        
     
        
        
        <!--Modal for updating profile-->
        
         <div class="container" >
                <div class="modal fade" id="ProfileModal" role="dialog" >
                     <div class="modal-dialog" >
    
      <!-- Modal content-->
                            <div class="modal-content" style="background-image: linear-gradient(to bottom right,#7671fe,#82c9fa,#87f0ff) ">
                                  <div class="modal-header">
                                     <h4 class="modal-title">Update Profile</h4>
                                  </div>
                            <div class="modal-body">
            
           
                   <form class="was-validated">
                       <div class="form-group ">
                              <label>Firstname</label>
                             <input id="modal_firstname" class="form-control "  name="modal_firstname" required>   
                              
                       </div>
               
                      <div class="form-group  ">
                            <label>Lastname</label>
                           <input type="text" id="modal_lastname" class="form-control " name="modal_lastname" required>    
                       </div>
                 
                     <div class="form-group">
                          <label>Mobile</label>
                         <input type="text" id="modal_mobile" class="form-control "  name="modal_mobile" required>    
                    </div>
                 
                   <div class="form-group">
                         <label for="comment">Description:</label>
                         <textarea class="form-control" rows="4" id="modal_description" name="description"></textarea>
                   </div>
       </form>
           
            
            
      
           <!--submit button-->
 
                 <div class="d-flex justify-content-center mt-3">
                      <input type="submit" class="btn btn-outline-primary" value="Upload"  onclick="changeProfile()" class="close" data-dismiss="modal" />
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

        
        
        
        
               <!---->
        
        
        
        
        
    </body>
</html>
