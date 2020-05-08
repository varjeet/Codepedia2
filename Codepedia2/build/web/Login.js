 ////functions to check no field is null on typing//////////
 function go3()
    {
        design("username","icon_username");
      
    }
     function go5()
    {
        design("password","icon_password");
      
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

//////////functions to validate fields on button click/////////////////////////
function go()
{
   
    var  username=document.getElementById("username").value.trim();
 
    var password=document.getElementById("password").value.trim();
   

var flag=0;


if(username!="" && password!="")
{

if(!(password_validator(password)))
{
     alert("please specify password min 8 letter password, with at least a symbol, upper and lower case letters and a number");
 design1("password","icon_password");
 flag=1;
}
else if(flag==0)
{ 
    
    var form=document.getElementById("form1");
        var formdata=new FormData();

formdata.append("username",username);
formdata.append("password",password);
//formdata.append("mobile",mobile);


 var xhr = new XMLHttpRequest;
                    
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                           
                             if(res=== "success")
                            {
                                  
                                   //redirect logic Pending
                                 window.location.href = "Home.jsp";
                             
                            }
                            else
                            {
                                   alert("Invalid Username/password");
                               
                            }
                        }
                    };
                    
                    xhr.open("POST","./Login", true);
                    
                    //alert("Check Console Log");
                    
                  //  console.log(formdata);
                    xhr.send(formdata);
    }
}
else
{
    if(username=="")
    {
        alert("Please enter valid username");
        design1("username","icon_username");
    }
    if(password=="")
    {
        alert("Please Enter your password");
    design1("password","icon_password");
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
    

/* Forget Password Send Email for otp */

