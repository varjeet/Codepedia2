

import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java2.DBLoader2;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
public class RecoverPassword extends HttpServlet {
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
  
        String mail=request.getParameter("mail");
        System.out.println("Mail is "+mail);
        String otp=String.format("%06d",new SecureRandom().nextInt(1_000_000));//It is secured 8 digit otp.....

        try
        {
            
            ResultSet rs=DBLoader2.executeQuery("select * from recoverpassword where mail=\'"+mail+"\'");
            if(rs.next())
            {
                rs.updateString("otp", otp);//please make a new unique column in database of otp or make a new table it is up to you
                rs.updateRow();
                String subject="Your otp for recover password";
                String body="your otp is"+otp;
                SendMail sm=new SendMail(mail,subject,body);
                out.println("success");/////please open login page in js after recieving success.. 
                
            }
            else
            {
                ResultSet rs2=DBLoader2.executeQuery("select * from signup where mail=\'"+mail+"\'");
                if(rs2.next())
                {
                rs.moveToInsertRow();
               rs.updateString("mail", mail);
               rs.updateString("otp", otp);
               rs.insertRow();
               String subject="Your otp for recover password";
               String body="your otp is"+otp;
               SendMail sm=new SendMail(mail,subject,body);
               out.println("success");
            }
                else
                {
                    out.println("fail");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}