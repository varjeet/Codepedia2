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

/**
 *
 * @author sahib
 */
@MultipartConfig
public class Signup2 extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
          response.setContentType("text/html");
    
           PrintWriter out = response.getWriter();
           
          // Now receive text data
          String firstname = request.getParameter("firstname");
          System.out.println(firstname);
          String lastname = request.getParameter("lastname");
          System.out.println(lastname);
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          String mobile =   request.getParameter("mobile");
          String gender =   request.getParameter("radio1");
          System.out.println(gender);
           String mail  =   request.getParameter("mail");
           String file="";
           if(gender.equals("male"))
           {
               file="male.jpg";
           }
           else if(gender.equals("female"))
           {
               file="female.png";
           }
           else if(gender.equals("others"))
           {
               file="others.png";
           }
           
           
          try
          {
              ResultSet rs=DBLoader2.executeQuery("select * from signup where username=\""+username+"\"");
              if(rs.next())
              {
                  out.println("fail");
              }
              else
              {
                 rs.moveToInsertRow();
                 rs.updateString("firstname", firstname);
                 rs.updateString("lastname",  lastname);
                 rs.updateString("username", username);
                 rs.updateString("password", password);
                 rs.updateString("mobile",  mobile);
                  rs.updateString("gender",  gender);
                 rs.updateString("mail",mail);
                   rs.updateString("photo", "myuploads/"+file);
                 rs.insertRow();
                  out.println("success");

              }
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
           
    }   
}
    