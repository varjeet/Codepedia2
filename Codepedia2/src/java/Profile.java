/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sahib
 */
public class Profile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                                                            throws ServletException, IOException 
    {
        
        // Step 1
        response.setContentType("text/html");
    HttpSession session  = request.getSession();
           String username=(String) session.getAttribute("usersession");
        
        //Step 2
        PrintWriter out = response.getWriter();
        
        String ans = new java2.RDBMS_to_JSON().generateJSON("select * from signup where username=\""+username+"\"");
        System.out.println(ans);
        
        out.print(ans);
        
    }
}
