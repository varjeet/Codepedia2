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
 */@MultipartConfig
public class NewPassword extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                                            throws ServletException, IOException 
    {
        
        // Step 1
        response.setContentType("text/html");
        
        // Step 2
        PrintWriter out = response.getWriter();
      String mail=request.getParameter("mail");
        String newpassword=request.getParameter("newpassword");
        
        
        
        try
           {
                             ResultSet rs=DBLoader2.executeQuery("select * from signup where mail=\""+mail+"\"");
                           if(rs.next())
                           {
                              
                               rs.updateString("password", newpassword);
                               rs.updateRow();
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
              out.println("error");
           }
            
    }
    
}