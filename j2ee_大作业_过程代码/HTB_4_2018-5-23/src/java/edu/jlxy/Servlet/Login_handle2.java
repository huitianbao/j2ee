/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.UserImpl;

import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class Login_handle2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        // 1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        // 2  获得数据
        String username = request.getParameter("name");
        String password = request.getParameter("psd");
        String message = request.getParameter("contact_message");
        //        System.out.println("=======doPost=======");
//        System.out.println("username ==>" + username);
//        System.out.println("password ==>" + password);
//        System.out.println("message  ==>"+message);
//  3 查询用户和用户名
        UserEntity userEntity = new UserEntity();
        UserImpl userImpl = new UserImpl();
        ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
        userEntity.setuid1(username);
        userEntity.setpwd(password);
//查询所有用户名

        try {
            //查询所有用户名
            ResultSet resultSet = userImpl.queryAllUId(connection);
            boolean isExist = resultSetUtil.isRepat(username, resultSet);
            System.out.println("该用户名是否存在：" + isExist);
            String forward = null;
            //比较用户名
            if (isExist) {
                //若用户名校验成功，再校验密码
                resultSet = userImpl.queryPwd(connection, userEntity);
                isExist = resultSetUtil.isRepat(password, resultSet);
                System.out.println("密码是否匹配：" + isExist);
                if (isExist) {
                    // 登录成功 记下 用户名
                    ServletContext servletcontext=this.getServletContext();
                    servletcontext.setAttribute("username", username);
                    
                    
                    forward = "/PersonalPage.html";
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
                    requestDispatcher.forward(request, response);
                } else {

                    //发出警告信息，提示错误
                    out.print(
                            "<script language='javascript'>alert('用户名或密码错误！');window.location.href='http://localhost:8080/HTB_3_2018-5-23/Login.html';</script>");
                    //跳转到原来页面
                    forward = "/Login.jsp";
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
                    requestDispatcher.forward(request, response);
                }
            } else {

                out.print(
                        "<script language='javascript'>alert('用户名或密码错误！');window.location.href='http://localhost:8080/HTB_3_2018-5-23/Login.html';</script>");
//				forward = "/WEB-VIEW/Login.jsp";
//				RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
//				requestDispatcher.forward(request, response);

            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
                connection.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("=======连接关闭！=======");
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
