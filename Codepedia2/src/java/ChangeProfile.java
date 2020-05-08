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
public class ChangeProfile extends HttpServlet {

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
           String mobile =   request.getParameter("mobile");
           String description=request.getParameter("description");
          
           HttpSession session  = request.getSession();
           String username=(String) session.getAttribute("usersession");
           
           
          try
          {
              ResultSet rs=DBLoader2.executeQuery("select * from signup where username=\""+username+"\"");
             
                  if(rs.next())
                  {

                 rs.updateString("firstname", firstname);
                 rs.updateString("lastname",  lastname);
                 rs.updateString("mobile",  mobile);
                 rs.updateString("description",description);
                 rs.updateRow();
                  out.println("success");
                  }
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
           
    }   
}
    