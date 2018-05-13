/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlxy.responsedemo2;

import java.io.IOException;
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
public class ResponseDemo2 extends HttpServlet {
//通过 response 的writer 流 写字符和字符串
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset='UTF-8'");
        String data = "中国";
        PrintWriter pw = response.getWriter();
        pw.write(data);

    }

    public void test1(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        PrintWriter pw = null;
        try {
            response.setHeader("content-type", "text/html;charset='UTF-8'");
            String data = "中国";
            pw = response.getWriter();
            pw.write(data);
        } catch (IOException ex) {
            Logger.getLogger(ResponseDemo2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
