/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author sahib
 */
public class SendMail {
    private  String mail;
    private      String subject;
    private      String body;

  
    SendMail(String mail, String subject, String body) {
        this.mail=mail;
        this.body=body;
        this.subject=subject;
        sendmail();
    }
   
    public void sendmail()
    {
        String email="codepediaa@gmail.com";
        String pword="codepedia@123";
        Properties properties=new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(email,pword);
            }
});
        try
        {
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
            message.setSubject(subject);
            
            message.setText(body);
           // message.setText("Your verification link::"+"http://localhost:8080/cloudCompiler/ActivationAccount?key1="+mail+"&key2="+myhash);
            Transport.send(message);
        }
        catch(Exception e)
        {
            System.out.println("SendingEmail"+e);
        }
    }
}
