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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class Login_handle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
         this.getServletContext().setAttribute("currentuser", username);
        System.out.println("=====doPost=====");
        System.out.println("username ==>" + username);
        System.out.println("password ==>" + password);
        UserEntity userEntity = new UserEntity();
        UserImpl userImpl = new UserImpl();
        ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();

        userEntity.setname(username);
        userEntity.setpwd(password);
        try {
            //查询所有用户名
            ResultSet resultSet = userImpl.queryAllUId(connection);
            System.out.println(resultSetUtil.isRepat(username, resultSet));
            String forward = null;
            //比较用户名
            if (resultSetUtil.isRepat(username, resultSet)) {
                //若用户名校验成功，再校验密码
                resultSet = userImpl.queryPwd(connection, userEntity);
                if (resultSetUtil.isRepat(password, resultSet)) {
                    forward = "/PersonalPage.jsp";
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
                    requestDispatcher.forward(request, response);
                } else {

                    //发出警告信息，提示错误
                    out.print(
                            "<script language='javascript'>alert('用户名或密码错误！');window.location.href='welcome.jsp';</script>");
                    //跳转到原来页面
                    forward = "/Login_htb.jsp";
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
                    requestDispatcher.forward(request, response);
                }
            } else {

                out.print(
                        "<script language='javascript'>alert('用户名或密码错误！');window.location.href='welcome.jsp';</script>");
//				forward = "/WEB-VIEW/Login.jsp";
//				RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
//				requestDispatcher.forward(request, response);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
