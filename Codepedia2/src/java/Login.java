/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java2.DBLoader2;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sahib
 */
@MultipartConfig
public class Login extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
          response.setContentType("text/html");
    
           PrintWriter out = response.getWriter();
           
         String username   = request.getParameter("username");
          String password = request.getParameter("password");
         // String mobile =   request.getParameter("mobile");
         
           
       
          try
          {
              ResultSet rs=DBLoader2.executeQuery("select * from signup where username=\'"+username+"\' and password=\'"+password+"\'");
              if(rs.next())
              {
                  HttpSession session=request.getSession();
                  session.setAttribute("usersession",username);
                  out.println("success");
              }
              else
              {
                
                  out.println("fail");

              }
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
           
    }   
}
   