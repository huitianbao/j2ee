/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlxy.servlet.demo12.dao;

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

    public UserDao() {
    }
    
    
    public void update()throws IOException{
        System.out.println(dbconfig.getProperty("url"));
        
    }
    
    
/*
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
