/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.test;

import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.impl.NoteImpl;
import edu.jlxy.util.Conn;
import java.io.NotActiveException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class TestSQL {
    static {
         try {
            Conn c=new Conn();
            
            Connection chtb=c.getConnection();
            // 打印一个connection对象的属性�������
            System.out.println(chtb.getAutoCommit());
            
        } catch (SQLException ex) {
            Logger.getLogger(TestSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        NoteEntity noteEntity=new NoteEntity();
        NoteImpl ni=new NoteImpl();
        
        noteEntity.setAllInfo("22", "22", "fffff", "hhhh");
        
        
        
       
       
    }
    
}
