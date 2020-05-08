<% String username=(String)session.getAttribute("usersession"); %>
<div class="container-">
       <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
           <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navdata">
               <span class="navbar-toggler-icon"></span>
               </button>
           <div class="collapse navbar-collapse" id="navdata">
              <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="navbar-brand " href="#">Welcome <%= username%></a></li>
                <li class="nav-item">
                    <a class="nav-link" href="ChangePassword.jsp">Change Password</a></li>
                <li class="nav-item">
                    <a class="nav-link" href="Profile.jsp">Profile</a></li>
                <li class="nav-item">
                    <a class="nav-link" href="#">link 4</a></li>
            </ul>
               </div>

       
       </nav>
        
</div>      




           