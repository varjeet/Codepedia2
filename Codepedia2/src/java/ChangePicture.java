/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java2.DBLoader2;
import java2.Fileuploading;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class ChangePicture extends HttpServlet {
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String file="";
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       Part p1=request.getPart("dp_choser");
       String abspath = getServletContext().getRealPath("myuploads");
        System.out.println("Content is"+p1.getContentType());
       if(p1.getContentType().toString().equals("image/png"))
       {
           file=System.currentTimeMillis()+".png";
       }
           else if(p1.getContentType().toString().equals("image/jpg"))
       {
             file=System.currentTimeMillis()+".jpg";
       }
       else if(p1.getContentType().toString().equals("image/jpeg"))
       {
             file=System.currentTimeMillis()+".jpg";
       }
       
       String filename=Fileuploading.savefileonserver(p1, abspath,file);
         HttpSession session  = request.getSession();
           String username=(String) session.getAttribute("usersession");
           try
           {
               ResultSet rs=DBLoader2.executeQuery("select * from signup where username=\'"+username+"\'");
               if(rs.next())
               {
                   rs.updateString("photo", "myuploads/"+filename);
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