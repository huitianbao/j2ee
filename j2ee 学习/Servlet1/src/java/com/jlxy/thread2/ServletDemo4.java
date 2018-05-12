/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jlxy.thread2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class ServletDemo4 extends HttpServlet implements SingleThreadModel {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); //To change body of generated methods, choose Tools | Templates.
        System.out.println("this is init ===============================");
    }
    
     int i = 0;//此时有线程安全问题

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
          synchronized(this){
             try {
             int i=0;
            i++;
            Thread.sleep(1000*10);
            
            System.out.println("i");
            response.getOutputStream().write((i+"").getBytes());
        } catch (InterruptedException ex) {
            Logger.getLogger(ServletDemo4_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    } 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      doGet(request,response);
    }

  


}
