/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java2.DBLoader2;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PARAM
 */
public class SaveFile extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                String lang = request.getParameter("lang").toLowerCase();
                String title=request.getParameter("title").toLowerCase();
            String filename = request.getSession().getAttribute("filename").toString();
           String username = request.getSession().getAttribute("usersession").toString();
            String abspath = request.getServletContext().getRealPath("/alluserdata");
         
            abspath += "//" + username + "//" + lang;
           String codepath=abspath+"\\"+filename+getExt(lang).trim();
        try {
            ResultSet rs=DBLoader2.executeQuery("Select * from usercodes where title=\""+title+"\"");
            
            if(rs.next())
            {
                  out.println("fail");
                  System.out.println(rs.getString("codepath"));
                 System.out.println(rs.getString("title"));
             }
            else
            {
                 
                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("language", lang);
                rs.updateString("title", title);
                rs.updateString("codepath", codepath);
                rs.insertRow();
                out.println("success");
            }
            
        } catch (Exception ex)
        {
            
          ex.printStackTrace();
           out.println(ex.getMessage()); 
        
        }
           
    
    
    
    }
    private String getExt(String lang)
    {
        String ext = "";
        if(lang.equalsIgnoreCase("java"))
        {
            ext = ".java";
        }
        else if(lang.equalsIgnoreCase("c"))
        {
            ext = ".c";
        }
        else if(lang.equalsIgnoreCase("cpp"))
        {
            ext = ".cpp";
        }
        else
        {
            ext = ".py";
        }
        return ext;
    }

    

}
