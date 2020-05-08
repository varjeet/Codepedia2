 $(document).ready(function()
            {
                $("#passwordModal").modal('show');
            });
           
 ///function to stop closing of modal from anywhere//////// 
 $(document).ready(function(){
	$('#body').click(function(){
  		$('#passwordModal').modal({
    		backdrop: 'static',
    		keyboard: false
		});
	});
});


    
    function go2()
    {
        design("newpassword","icon_newpassword");
      
    }
     function go3()
    {
        design("confirmpassword","icon_confirmpassword");
      
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
     
     
    /////////Check after buutton click/////////////////////////
function go()
{
   
   
    var newpassword=document.getElementById("newpassword").value.trim();
     var confirmpassword=document.getElementById("confirmpassword").value.trim();
   

var flag=0;
if(newpassword!="" && confirmpassword!="")
{

if(!(password_validator(newpassword)))
{
     alert("please specify password min 8 letter password, with at least a symbol, upper and lower case letters and a number");
 design1("newpassword","icon_newpassword");
 flag=1;
}
else if(newpassword!=confirmpassword)
{
    alert("confirm password do not match the new password");
design1("confirmpassword","icon_confirmpassword");
flag=1;
}
else if(flag==0)
{ 
    
   // var form=document.getElementById();
        var formdata=new FormData();
var mail=document.getElementById("mail").value;
formdata.append("newpassword",newpassword);
formdata.append("mail",mail);
console.log("mail is "+ mail);
//formdata.append("mobile",mobile);


 var xhr = new XMLHttpRequest;
                    
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                           
                             if(res==="success")
                            {
                                  alert("Password changed successfully");    
                                  window.location.href="Login.jsp";
                            }
                            else 
                            {
                                   alert("Error Occured");
                               
                            }
                        }
                    };
                    
                    xhr.open("POST","./NewPassword", true);
                    
                    //alert("Check Console Log");
                    
                  //  console.log(formdata);
                    xhr.send(formdata);
    }
}
else
{  
    if(newpassword=="")
    {
        design1("newpassword","icon_newpassword");
    }
if(confirmpassword=="")
    {
        design1("confirmpassword","icon_confirmpassword");
    }

        
}
    }

 function password_validator(password)
 {
     if((/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/).test(password))
     {
         return true;
     }
     else
         return false;
 }

 
function design1(input_name,icon_name)
     {
        
                 document.getElementById(icon_name).className="fa fa-times";
           document.getElementById(icon_name).style.visibility="visible";
          document.getElementById(icon_name).style.color="red"; 
         
     }
    


