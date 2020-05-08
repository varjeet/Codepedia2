<%-- 
    Document   : Home
    Created on : Apr 28, 2020, 9:49:48 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <% String username=(String)session.getAttribute("usersession"); %>
       <nav class="navbar navbar-expand-sm  navbar-dark bg-dark ">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="navbar-brand " href="#">Welcome <%= username%></a></li>
                <li class="nav-item">
                    <a class="nav-link" href="ChangePassword.jsp">Change Password</a></li>
                <li class="nav-item">
                    <a class="nav-link" href="Profile.jsp">Profile</a></li>
                <li class="nav-item">
                    <a class="nav-link" href="User_Compiler.jsp">Compiler</a></li>
                <li class="nav-item">
                    <a class="nav-link" href="#">link 4</a></li>
            </ul>
       </nav>
           
    </body>
</html>
