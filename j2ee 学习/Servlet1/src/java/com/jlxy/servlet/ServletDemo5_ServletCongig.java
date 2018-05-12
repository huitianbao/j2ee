/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jlxy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class ServletDemo5_ServletCongig extends HttpServlet {
   private ServletConfig config;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //this.getServletConfig().getInitParameter("data");
        
    //    String valueString=config.getInitParameter("data");
      //  System.out.println(valueString);
        
        Enumeration eumEnumeration=this.getServletConfig().getInitParameterNames();
        while (eumEnumeration.hasMoreElements()) {
            String name = eumEnumeration.nextElement().toString();
            String dataString=this.getServletConfig().getInitParameter(name);
            
            System.out.println("name  :"+name+"data  :"+dataString);
        }
      
    } 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      doGet(request,response);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.config=config;
    }

  


}
