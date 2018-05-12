
package com.jlxy.servlet.demo11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
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
public class ServletDemo11 extends HttpServlet {

    //db.properties 文件在 src 下面的情况
    //real path 法
    private void test1_function2() {

        FileInputStream in = null;
        try {
            // 方法二

            String realpath = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
            in = new FileInputStream(realpath);
            Properties p = new Properties();
            try {
                p.load(in);

                String url = p.getProperty("url");
                String username = p.getProperty("username");
                String password = p.getProperty("password");

                System.out.println(url);
                System.out.println(username);
                System.out.println(password);
            } catch (IOException ex) {
                Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void test1_function1() {
        try {
            // 读取 properties 文件的方法一
            InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
            Properties p = new Properties();
            p.load(inputStream);

            String url = p.getProperty("url");
            String username = p.getProperty("username");
            String password = p.getProperty("password");

            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
        } catch (IOException ex) {
            Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // db.properties 文件在 com.jlxy.servlet.demo11   包里面
    private void test2_function1() {
        try {
            InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/jlxy/servlet/demo11/db.properties");
            if (inputStream==null) {
                System.out.println("null null null null null null null null null ");
            }
            Properties p = new Properties();
            p.load(inputStream);

            String url = p.getProperty("url");
            String username = p.getProperty("username");
            String password = p.getProperty("password");

            System.out.println(url);
            System.out.println(username);
            System.out.println(password);

        } catch (IOException ex) {
            Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //db.properties 文件在 web页下面
    
    private void test3_function1(){
        try {
            InputStream inputStream=this.getServletContext().getResourceAsStream("/db.properties");
            Properties p=new Properties();
            p.load(inputStream);
            
            String url=p.getProperty("url");
            String username=p.getProperty("username");
            String password=p.getProperty("password");
            
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
        } catch (IOException ex) {
            Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    
    //采用 realPath 的方法
    
    private void test4_funcrion(){
        FileInputStream fis=null;
        try {
            String realpath=this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
            fis = new FileInputStream(realpath);
            Properties p = new Properties();
            
            try {
                p.load(fis);
            } catch (IOException ex) {
                Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url = p.getProperty("url");
            String username = p.getProperty("username");
            String password = p.getProperty("password");
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
            
            System.out.println("真实的路径是："+realpath);
            
            String filename=realpath.substring(realpath.lastIndexOf("\\")+1);
            
            System.out.println("文件的名称是："+filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(ServletDemo11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //test1_function1();    //success
        //test1_function2();   // success
        
       // test2_function1();  //success
       
       //test3_function1();  //success
       
       test4_funcrion();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
