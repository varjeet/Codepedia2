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

@MultipartConfig
public class EnterOtp extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String otp=request.getParameter("otp");
       System.out.println("ot is"+otp);
String mail;
       try
        {
            ResultSet rs=DBLoader2.executeQuery("select * from recoverpassword where otp=\'"+otp+"\'");
            if(rs.next())  
            {
                mail=rs.getString("mail");
            //  request.getRequestDispatcher("/NewPassword.jsp").forward(request, response);
              out.println(mail);
                
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