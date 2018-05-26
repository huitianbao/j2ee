/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.test;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.Dynamic;
import edu.jlxy.Module.table.impl.DynamicImpl;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.DateUtil;
import edu.jlxy.util.ResultSetUtil;
import java.sql.Connection;
import java.sql.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class SQLTesthtb {

    /*
    public static void main(String[] args) {
        try {
            ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
            Connection connection = null;
            connection = ConnectionFactory.getInstance().makeConnection();

            connection.setAutoCommit(false);
//
            ResultSet rset;
            
            DynamicEntity dynamicEntity=new DynamicEntity();
            ShareEntity shareEntity=new ShareEntity();
            //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
           // Date date=new Date(System.currentTimeMillis());
           
           //
           DateUtil date=new DateUtil();
           
          
                      
            dynamicEntity.setAllInfo("title11","content11",null);
            Date date1=new Date(System.currentTimeMillis());
            shareEntity.setAllInfo("11", "11", date1);
           
     
            DynamicImpl dynamicImpl=new DynamicImpl();
            try {
                
                dynamicImpl.insert(connection, dynamicEntity, shareEntity);
                //dynamicImpl.queryAllDId(connection, dynamicEntity, shareEntity);
                connection.commit();
                
                
            } catch (Exception ex) {
                
                Logger.getLogger(SQLTesthtb.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
                    
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SQLTesthtb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

*/
    
    
    public static void main(String[] args) {
        try {
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();
            
            
            UserEntity userEntity = new UserEntity();
            UserImpl userImpl = new UserImpl();
            ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
            
            //查询所有用户名
            ResultSet resultSet = userImpl.queryAllUId(connection);
             int col=resultSet.getMetaData().getColumnCount();
            System.out.println("col=  "+col);
            while (resultSet.next()) {                
                for (int i = 1; i <=col; i++) {
                    System.out.print(resultSet.getString(i)+"   ");
//                     if ((i == 3) && (rs.getString(i).length() < 8)) {  
//                        System.out.print("\t");  
//                    }  
                     
                }
                  System.out.println("");  
            }
            System.out.println("==========================");
        } catch (SQLException ex) {
            Logger.getLogger(SQLTesthtb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
