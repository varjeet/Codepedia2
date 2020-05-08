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

/**
 *
 * @author singh
 */
public class Public_Run1 extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String lang = request.getParameter("lang");
            String args = request.getParameter("input");
            args = args.replaceAll(",", " ");
            String filename = request.getSession().getAttribute("filename").toString();
            String email = "public";
            String abspath = request.getServletContext().getRealPath("/alluserdata");

            abspath += "//" + email + "//" + lang;

            ProcessBuilder pb=null;

            System.out.println("abspath : " + abspath);
            File f = new File(abspath);
            if (lang.equalsIgnoreCase("java")) {
                pb = new ProcessBuilder("cmd", "/c", "java -cp \"" + f.getPath() + "\" " + filename + " " + args);
                pb.directory(f);
               
                Process p = pb.start();
                int code = p.waitFor();

                InputStream is;
                InputStream iserror;

                is = p.getInputStream();
                iserror = p.getErrorStream();

                InputStreamReader isr1 = new InputStreamReader(is);
                BufferedReader br1 = new BufferedReader(isr1);

                InputStreamReader isr2 = new InputStreamReader(iserror);
                BufferedReader br2 = new BufferedReader(isr2);

                String ans = "";
                while ((ans = br1.readLine()) != null) {
                    out.println(ans);
                    System.out.println("answer is"+ans);
                }
                br1.close();

                while ((ans = br2.readLine()) != null) {
                    out.println(ans);
                }
                br2.close();

            }
            
            else if(lang.equalsIgnoreCase("c"))
            {
                pb=new ProcessBuilder("cmd","/c",filename+".exe"+" "+args);
                pb.directory(f);
                Process p=pb.start();
                int code=p.waitFor();
                InputStream is,iserror;
                is=p.getInputStream();
                iserror=p.getErrorStream();
                InputStreamReader isr=new InputStreamReader(is);
                InputStreamReader isrerror=new InputStreamReader(iserror);
                BufferedReader br=new BufferedReader(isr);
                BufferedReader brerror=new BufferedReader(isrerror);
               String ans="";
                while((ans=br.readLine())!=null)
                {
                    out.println(ans);
                }
                br.close();
                  while((ans=brerror.readLine())!=null)
                {
                    out.println(ans);
                }
                  brerror.close();
                
            }
            else if(lang.equalsIgnoreCase("cpp"))
            {
                pb=new ProcessBuilder("cmd","/c",filename+".exe"+" "+args);
                pb.directory(f);
                Process p=pb.start();
                int code=p.waitFor();
                InputStream is,iserror;
                is=p.getInputStream();
                iserror=p.getErrorStream();
                InputStreamReader isr=new InputStreamReader(is);
                InputStreamReader isrerror=new InputStreamReader(iserror);
                BufferedReader br=new BufferedReader(isr);
                BufferedReader brerror=new BufferedReader(isrerror);
               String ans="";
                while((ans=br.readLine())!=null)
                {
                    out.println(ans);
                }
                br.close();
                  while((ans=brerror.readLine())!=null)
                {
                    out.println(ans);
                }
                  brerror.close();
                
            }
       
             else //for python
            {
              //  String args  = request.getParameter("args");
                //args =  args.replace(",", " ");
                pb = new ProcessBuilder("cmd", "/c", "python " + filename + ".py" + " " + args);
                pb.directory(f);
               pb.environment().put("Path", Path.pythoncompiler);
                Process p = pb.start();
                int code = p.waitFor();

                InputStream is;
                if (code == 0) {
                    is = p.getInputStream();
                } else {
                    is = p.getErrorStream();
                    File f1 = new File(abspath + "\\" + filename + ".py");
                    if (f1.exists()) {
                        f1.delete();
                    }
                }
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String ans = "";
                while ((ans = br.readLine()) != null) {
                    out.println(ans);
                }
                br.close();
                is.close();
            }      
        
            
        }
           
         catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
        
        
    }

    