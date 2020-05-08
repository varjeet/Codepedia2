function go()
{
    var firstname=document.getElementById("firstname").value.trim();
    var lastname=document.getElementById("lastname").value.trim();
    var username=document.getElementById("username").value.trim();
    var  mail   =document.getElementById("mail").value.trim();
    var mobile=document.getElementById("mobile").value.trim();
    var password=document.getElementById("password").value.trim();
    var option=document.getElementsByName("radio1");
    
    
    
    
   var chosen;
    for(var i=0;i<option.length;i++)
    {
        if(option[i].checked)
        {
            chosen=option[i].value;
            console.log("valueis "+chosen);
            break;
        }
        
}
var flag=0;
var mobile2=parseInt(mobile);
/////check that every field is filled on button click//////////
if(firstname!="" && lastname!="" && username!="" && mail!="" && mobile!="" && password!="" && option!="")
{
 if(isNaN(mobile2)||  (!isNaN(mobile2) &&(mobile.length<10 ||mobile.length>10)))
{
    if(isNaN(mobile2))
    {
        alert("Please enter mobile number properly");
     design1("mobile","icon_mobile");
     flag=1;
        }
else
{
        alert("Please enter 10 digit mobile number");
     design1("mobile","icon_mobile");
     flag=1;
}
        
}
 if(!(name_validator(firstname)))
{
    alert("please enter first name properly");
 design1("firstname","icon_firstname");
 flag=1;
}
 if(!(name_validator(lastname)))
{
    alert("please enter last name properly");
 design1("lastname","icon_lastname");
 flag=1;
}

 if(!(email_validator(mail)))
{
    alert("your email is not in the format");
     design1("mail","icon_mail");
flag=1;
}

if(!(password_validator(password)))
{
    alert("please specify password min 8 letter password, with at least a symbol, upper and lower case letters and a number");
 design1("password","icon_password");
 flag=1;
}
else if(flag==0)
{ 
    
  //  var form=document.getElementById("form1");
        var formdata=new FormData();
        
formdata.append("firstname",firstname);
formdata.append("lastname",lastname);
formdata.append("username",username);
formdata.append("mail",mail);
formdata.append("password",password);
formdata.append("mobile",mobile);
formdata.append("radio1",chosen);

 var xhr = new XMLHttpRequest;
                    
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                           
                            if(res=== "success")
                            {
                                   alert("Signup successful");
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
                    
                    xhr.open("POST","./Signup2", true);
                    
                    //alert("Check Console Log");
                    
                    console.log(formdata);
                    xhr.send(formdata);
    }
}
else
{
    if(firstname=="")
    {
        design1("firstname","icon_firstname");
    }
    if(lastname=="")
    {
        design1("lastname","icon_lastname");
    }
    if(username=="")
    {
        design1("username","icon_username");
    }
    if(mail=="")
    {
        design1("mail","icon_mail");
    }
    if(mobile=="")
    {
        design1("mobile","icon_mobile");
    }
    
    if(password=="")
    {
        design1("password","icon_password");
    }

    alert("Please fill all the credentials");
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
 function name_validator(name)
 {
     if((/^[a-zA-Z ]*$/).test(name))
     {
         return true;
     }
     else
         return false;
 }
 function email_validator(mail)
 {
     if ((/^([A-Za-z0-9_\-\.])+\@([gmail|GMAIL|yahoo|YAHOO])+\.(com)$/).test(mail))
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
    
