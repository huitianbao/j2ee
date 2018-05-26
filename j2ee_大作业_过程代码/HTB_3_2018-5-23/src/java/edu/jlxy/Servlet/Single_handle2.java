/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.impl.DeliverImpl;
import edu.jlxy.Module.table.impl.NoteImpl;
import edu.jlxy.util.ConnectionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
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
public class Single_handle2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");

            String name = request.getParameter("name");
            String title = request.getParameter("title");
            String email = request.getParameter("email");
            String message = request.getParameter("message");

            /*
           // String totalString = "name " + name + "\n" + "title " + title + "\n" + "email " + email + "\n" + "message  " + message;
            
           //System.out.println("name " + name + "\n" + "title " + title + "\n" + "email " + email + "\n" + "message  " + message);
            
             PrintWriter pw=response.getWriter();
             pw.write("the name is  "+name+"<br/>");
             pw.write("the title is  "+title+"<br/>");
             pw.write("the email is  "+email+"<br/>");
             pw.write("the message is "+message+"<br/>");
            
             */
            //==========================================================================================================================
            //数据库操作
            //这里 的  name   就是  uid     message  就是  content
            //1  连接数据库
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();

            //2 创建有关实体
            NoteEntity ne = new NoteEntity();
            DeliverEntity de = new DeliverEntity();
            Date date1 = new Date(System.currentTimeMillis());
            // 获得 uid
            String currentuser = (String) this.getServletContext().getAttribute("username");

            // 这里的 name 就是 fid
            ne.setContent(message); //初始化一个  NoteEntity ne
            //            uid          fid   时间
            de.setAllInfo(currentuser, name, date1);  // 初始化一个  DeliverEntity de

            NoteImpl noteImpl = new NoteImpl();
            DeliverImpl deliverImpl = new DeliverImpl();

            /*
            // 插入之前做测试   输出要插入的数据
            
           // System.out.println("uid is "+currentuser);
           // System.out.println("fid is "+name);
           // System.out.println("date is "+date1);
           pw.write("the current user /   uid   is "+currentuser+"</br>");
           pw.write("the fid is  "+name+"</br>");
           pw.write("the date  is "+date1+"</br>");
    
           // 数据检查成功，啊哈哈
           
           
             */
//   到这里 已经获得了  数据

            /*
the name is 2
the title is 2
the email is 2
the message is 2
the current user / uid is 1
the fid is 2
the date is 2018-05-23
             */
            
            //下面开始插入到数据库中
              noteImpl.insert(connection, ne, de);
              connection.commit();
              
        } catch (Exception ex) {
            Logger.getLogger(Single_handle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
