
           //function to open modal wtihout animation on page load
 
$(document).ready(function()
            {
                $("#otpModal").modal('show');
            });
           
 ///function to stop closing of modal from anywhere//////// 
 $(document).ready(function(){
	$('#body').click(function(){
  		$('#otpModal').modal({
    		backdrop: 'static',
    		keyboard: false
		});
	});
});
           
           
       //Function to auto focus on next input otp    
$(function(){
	$('#1,#2,#3,#4,#5,#6').keyup(function(e)
                            {
		if($(this).val().length==$(this).attr('maxlength'))
		$(this).next(':input').focus()
		})
	})
        
        
        
        
        
        

function confirmOtp()
{
    var xhr = new XMLHttpRequest;
    var otp="";
    for(var i=1;i<=6;i++)
    {
        otp=otp+document.getElementById(i.toString()).value;
    }
                    console.log(otp);
                      var formdata=new FormData();
                   formdata.append("otp",otp);
                 var mail;
                    xhr.onreadystatechange = function ()
                    {
                        if (xhr.readyState === 4 && xhr.status == 200)
                        {
                            //get response from server
                            var res = xhr.responseText.trim();
                            console.log("Response is "+res);
                           
                             if(res==="fail")
                            {
                                alert(" Please enter correct OTP");  
                            }
                            else if(res==="error")
                            {
                                   alert("Error Occured! Please try again after sometime");
                            }
                            else
                            {
                                mail=res;
                                window.location.href="NewPassword.jsp?mail="+mail;
                            }
                        }
                    };
                    
                    xhr.open("POST","./EnterOtp", true);
                    
                    //alert("Check Console Log");
                    
                  //  console.log(formdata);
                    xhr.send(formdata);
    }
