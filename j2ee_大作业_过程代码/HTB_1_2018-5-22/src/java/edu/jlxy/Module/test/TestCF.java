/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.test;

import edu.jlxy.util.Conn;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class TestCF {
       public static void main(String[] args) {
        try {
            ConnectionFactory cf = ConnectionFactory.getInstance();
            // 获取数据库连接���
           // Connection connection = cf.makeConnection();
           Conn c=new Conn();
           
           Connection chtb=c.getConnection();
            // 打印一个connection对象的属性�������
            System.out.println(chtb.getAutoCommit());
        } catch (SQLException ex) {
            Logger.getLogger(TestConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
}
