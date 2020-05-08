import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class User_Compiler extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String lang = request.getParameter("lang").toLowerCase();
            String filename = request.getSession().getAttribute("filename").toString();
           String email = request.getSession().getAttribute("usersession").toString();
            String abspath = request.getServletContext().getRealPath("/alluserdata");
            
            abspath += "//" + email + "//" + lang;
            
            ProcessBuilder pb;

            System.out.println("abspath : " + abspath);
            File f = new File(abspath);
            if (lang.equalsIgnoreCase("java")) 
            {
                pb = new ProcessBuilder("cmd", "/c", "javac " + filename + ".java");
                pb.directory(f);
             
                Process p = pb.start();
                int code = p.waitFor();

                 InputStream is;     
                 if(code==0)
                 {
                     is = p.getInputStream();
                     out.println("File Saved and Compiled Successfully!!!");
                 }
                 else
                 {
                     is = p.getErrorStream();
                     File f1 = new File(abspath + "\\" + filename + ".class");
                     if(f1.exists())
                     {
                         f1.delete();
                     }
                 }
                 
                 InputStreamReader isr = new InputStreamReader(is);
                 BufferedReader br = new BufferedReader(isr);
                 String ans="";
                 while((ans= br.readLine()) != null)
                 {
                    out.println(ans);
                     System.out.println("ans is"+ ans);
                 }
                 br.close();
            }
            
            else if(lang.equalsIgnoreCase("c"))
            {
                pb=new ProcessBuilder("cmd","/c","gcc "+filename+".c -o "+filename+".exe");
                pb.directory(f);
                Process p=pb.start();
                int code=p.waitFor();
                InputStream is;
                if(code==0)
                {
                      is = p.getInputStream();
                    out.println("Compilation Successful");
                }
                else
                {
                    is=p.getErrorStream();
                    File f1=new File(abspath+"\\"+filename+".exe");
                    if(f1.exists())
                    {
                        f1.delete();
                    }
                   
                }
                 InputStreamReader isr=new InputStreamReader(is);
                    BufferedReader br=new BufferedReader(isr);
                    String ans="";
                    while((ans=br.readLine())!=null)
                    {
                        out.println(ans);
                    }
                    br.close();
            }
            
            
            else if(lang.equalsIgnoreCase("cpp"))
            {
                pb=new ProcessBuilder("cmd","/c","g++ "+filename+".cpp -o "+filename+".exe");
                pb.directory(f);
                Process p=pb.start();
                int code=p.waitFor();
                InputStream is;
                if(code==0)
                {
                      is = p.getInputStream();
                    out.println("Compilation Successful");
                }
                else
                {
                    is=p.getErrorStream();
                    File f1=new File(abspath+"\\"+filename+".exe");
                    if(f1.exists())
                    {
                        f1.delete();
                    }
                   
                }
                 InputStreamReader isr=new InputStreamReader(is);
                    BufferedReader br=new BufferedReader(isr);
                    String ans="";
                    while((ans=br.readLine())!=null)
                    {
                        out.println(ans);
                    }
                    br.close();
                
                
            }
        }
            
           catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
