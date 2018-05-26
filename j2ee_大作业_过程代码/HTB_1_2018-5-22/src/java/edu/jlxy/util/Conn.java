/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 16221
 */
public class Conn {
    
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String urlString = "jdbc:mysql://localhost/wehtb?useUnicode=true&characterEncoding=utf-8";
            String user = "root";
            String password = "htbwjj123";
            Connection connection;
            connection = DriverManager.getConnection(urlString, user, password);
         //   System.out.println(connection.getMetaData().getURL());
            return connection;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
