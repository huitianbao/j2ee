/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlxy.servlet.demo12.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class UserDao {

    /*
    private static Properties dbconfig=new Properties();

    static {
        try {
            InputStream inputStream=UserDao.class.getClassLoader().getResourceAsStream("db.properties");
            
            dbconfig.load(inputStream);
        } catch (IOException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new ExceptionInInitializerError(ex);
        }
        
    }
    
     */
    public UserDao() {
    }
//通过类装载的方式得到文件的位置，再2通过 fileInputStream 读取到更新的数据

    public void update() throws IOException {
        String pathString = UserDao.class.getClassLoader().getResource("/db.properties").getPath();

        FileInputStream in = new FileInputStream(pathString);
        Properties dbconfig = new Properties();
        dbconfig.load(in);

        System.out.println("url_god       "+dbconfig.getProperty("url_god"));
        System.out.println("url_htbtest   "+dbconfig.getProperty("url_htbtest"));
        System.out.println("url_lql       "+dbconfig.getProperty("url_lql"));
        System.out.println("url_jkstudent "+dbconfig.getProperty("url_jkstudent"));
        System.out.println("username      "+dbconfig.getProperty("username"));
        System.out.println("password      "+dbconfig.getProperty("password"));

    }

    /*
    //无法获得更新后的数据
     public void update() throws IOException {
        
        InputStream in=UserDao.class.getClassLoader().getResourceAsStream("db.properties");
        
        Properties p=new Properties();
        p.load(in);
        String urlString=p.getProperty("url");
        String usernameString=p.getProperty("username");
        String passwordString=p.getProperty("password");
        
        System.out.println("UserDao 输出");
        System.out.println(urlString);
        System.out.println(usernameString);
        System.out.println(passwordString);
        
        
        
    }
    
     */
}
