function fetch()
{
     var xhttp = new XMLHttpRequest();
               
               
                xhttp.onreadystatechange = function() 
                {
                    if (this.readyState == 4 && this.status == 200) 
                    {
                         // JSON as String 
                         var res = xhttp.responseText;
                         
                         console.log("new 1 Ansis"+res);
                         
                    
                         var main = JSON.parse(res);
                         
                         console.log(main);
                         
                     
                         var mainobj= main["ans"];
                            
                            var so=mainobj[0];
                         document.getElementById("username").innerHTML=so["username"];
                         document.getElementById("mobile").innerHTML=so["mobile"];
                         
                         document.getElementById("firstname").innerHTML=so["firstname"];
                         document.getElementById("lastname").innerHTML=so["lastname"];
                         document.getElementById("mail").innerHTML=so["mail"];
                           
                         document.getElementById("photo").src=so["photo"];
                          document.getElementById("modalphoto").src=so["photo"];
                          //things to show in update profile modal////////
                          document.getElementById("modal_firstname").value=so["firstname"];
                           document.getElementById("modal_lastname").value=so["lastname"];
                            document.getElementById("modal_mobile").value=so["mobile"];
                       document.getElementById("description").innerHTML=so["description"];
                       document.getElementById("modal_description").value=so["description"];
                       
                        
               
                         
                     }
                 };
                 xhttp.open("GET", "./Profile", true);    
                
                // Step 3
                xhttp.send();
                
                
                
                
}
function changePic()
{
    
     var xhttp = new XMLHttpRequest();
               
               var formdata=new FormData();
               var picture=document.getElementById("dp_choser").files[0];
             var pic=picture.name;
               formdata.append("dp_choser",picture);
                xhttp.onreadystatechange = function() 
                {
                    if (this.readyState == 4 && this.status == 200) 
                    {
                         // JSON as String 
                         var res = xhttp.responseText.trim();
                         console.log("response is"+res);
                         if(res==="success")
                         {
                             fetch();
                         }
                         else
                         {
                             alert("Error Occured");
                         }
                                 
                       
                 
                     }
                 };
                 xhttp.open("POST", "./ChangePicture", true);    
                
                // Step 3
                xhttp.send(formdata);
                       
}




function changeProfile()
{
     var firstname=document.getElementById("modal_firstname").value;
    var lastname=document.getElementById("modal_lastname").value;
    var mobile=document.getElementById("modal_mobile").value;
   var description=document.getElementById("modal_description").value;
     
var flag=0;
var mobile2=parseInt(mobile);
/////check that every field is filled on button click//////////
if(firstname!="" && lastname!=""  && mobile!="" && description!="")
{
 if(isNaN(mobile2)||  (!isNaN(mobile2) &&(mobile.length<10 ||mobile.length>10)))
{
    if(isNaN(mobile2))
    {
        alert("Please enter mobile number properly");
     flag=1;
        }
else
{
        alert("Please enter 10 digit mobile number");
     flag=1;
}
        
}
 if(!(name_validator(firstname)))
{
    
 document.getElementById("if1").className="invalid-feedback";
 flag=1;
}
 if(!(name_validator(lastname)))
{
    alert("please enter last name properly");
 
 flag=1;
}

 
else if(flag==0)
{ 
    
  //  var form=document.getElementById("form1");
        var formdata=new FormData();
        
formdata.append("firstname",firstname);
formdata.append("lastname",lastname);
formdata.append("mobile",mobile);
formdata.append("description",description);

 var xhr = new XMLHttpRequest;
                    
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                           
                            if(res=== "success")
                            {
                                  fetch();
                            }
                            else if(res==="fail")
                            {
                                   alert("Username already exist");
                            }
                            else
                            {
                                alert("Signup failed due to some error");
                            }
                        }
                    };
                    
                    xhr.open("POST","./ChangeProfile", true);
                    
                    //alert("Check Console Log");
                    
                    console.log(formdata);
                    xhr.send(formdata);
    }
}
else
{
    if(firstname=="")
    {
        alert("please enter the firstname");
    }
    if(lastname=="")
    {
     alert("please enter the lastname");
    }
    
    if(mobile=="")
    {
     alert("please enter the mobile");
    }
   
   if(description=="")
    {
     alert("please enter the description");
    }
}


    


 function name_validator(name)
 {
     if((/^[a-zA-Z ]*$/).test(name))
     {
         return true;
     }
     else
         return false;
 }
 

    
    }

    
