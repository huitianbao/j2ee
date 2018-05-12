/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jlxy.servlet.demo8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class ServletContext extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String dataString=this.getServletContext().getInitParameter("contextdata1");
        System.out.println(dataString);
        
        
        Enumeration enumeration=this.getServletContext().getInitParameterNames();
        
        while (enumeration.hasMoreElements()) {
            String nextElement = enumeration.nextElement().toString();
            
            System.out.println("name="+nextElement+"value="+this.getServletContext().getInitParameter(nextElement));
            
        }
      
    } 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      doGet(request,response);
    }

  


}
