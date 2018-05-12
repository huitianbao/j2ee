/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jlxy.servlet.demo10;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class ServletDemo10 extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String dataString="aaaaaaaaaaaaaaaaaaaaaaaaa from demo 10";
        // 把数据带给
        
        this.getServletContext().setAttribute("data", dataString);
        RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/demo10_1.jsp");
        rd.forward(request, response);
      
    } 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      doGet(request,response);
    }

  


}
