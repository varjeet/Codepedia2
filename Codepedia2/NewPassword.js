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