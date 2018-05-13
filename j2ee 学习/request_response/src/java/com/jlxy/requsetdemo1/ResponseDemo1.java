/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlxy.requsetdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class ResponseDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //test2(response);
        //test1(response);
        //test3(response);
        test4(response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    public void test1(HttpServletResponse response) {
        try {
            String data = "中国";
            // response.setHeader("Content-type", "text/html:charset=UTF-8");

            OutputStream outputStream = response.getOutputStream();
            // outputStream.write(data.getBytes("UTF-8"));
            outputStream.write(data.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(ResponseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void test2(HttpServletResponse response) {
        try {
            String data = "中国";
            // response.setHeader("Content-type", "text/html:charset=UTF-8");

            OutputStream outputStream = response.getOutputStream();
            // outputStream.write(data.getBytes("UTF-8"));
            outputStream.write("<meta http-eqiv='content-type' content='text/html;charset=UTF-8'>".getBytes());
            outputStream.write(data.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(ResponseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
        
        
        
        public void test3(HttpServletResponse response){
                  try {
            String data = "中国";
            response.setHeader("Content-type", "text/html:charset=UTF-8");

            OutputStream outputStream = response.getOutputStream();
            // outputStream.write(data.getBytes("UTF-8"));
            outputStream.write(data.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(ResponseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
         public void test4(HttpServletResponse response) {
        try {
            //String data = "中国";
           
            OutputStream outputStream = response.getOutputStream();
        
           
            outputStream.write((1+"").getBytes());
        } catch (IOException ex) {
            Logger.getLogger(ResponseDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
        }


