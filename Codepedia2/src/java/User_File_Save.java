/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author singh
 */
@MultipartConfig
public class User_File_Save extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
            PrintWriter out = response.getWriter();
            String lang = request.getParameter("lang");
            String code = request.getParameter("code");
            System.out.println("lang :" + lang);
            System.out.println("code : " + code);
            String abspath = request.getServletContext().getRealPath("/alluserdata");
            String email = request.getSession().getAttribute("usersession").toString();
            
            abspath = abspath + "\\" + email ;
            
            File f = new File(abspath);
            if(!f.exists())
            {
                f.mkdir();
            }
            
            File f1 = new File(abspath + "\\"  + lang);
            
            if(!f1.exists())
            {
                f1.mkdir();
            }
            
            String filename = "";
            
            if(lang.equalsIgnoreCase("c") || lang.equalsIgnoreCase("cpp")||
                    lang.equalsIgnoreCase("python"))
            {
                filename = new Date().getTime()+"";
            }
            else
            {
                filename = code.substring((code.indexOf("class") + 6), code.indexOf("{")).trim();
            }
                        
           System.out.println("filename : " + filename);
           request.getSession().setAttribute("filename", filename);
           
           FileWriter fw = new FileWriter(f1 + "\\" + filename + ""+ getExt(lang));
           fw.write(code);
           fw.flush();
           
           out.println("success");
            
        } catch (Exception ex) {
            ex.printStackTrace();
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
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
