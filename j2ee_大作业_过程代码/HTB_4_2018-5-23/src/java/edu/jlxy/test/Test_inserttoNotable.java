/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.test;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.impl.DeliverImpl;
import edu.jlxy.Module.table.impl.NoteImpl;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class Test_inserttoNotable {

    public static void main(String[] args) {
        try {
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();

            //2 创建有关实体
            NoteEntity ne = new NoteEntity();
            DeliverEntity de = new DeliverEntity();
            Date date1 = new Date(System.currentTimeMillis());

            String name = "2";
            String title = "2title";
            String email = "2 email";
            String message = "2 message";

            String currentuser = "1";

            // 这里的 name 就是 fid
            ne.setnid(null);
            ne.setContent(message); //初始化一个  NoteEntity ne
            //            uid          fid   时间
            de.setAllInfo(currentuser, name, date1);  // 初始化一个  DeliverEntity de

            NoteImpl noteImpl = new NoteImpl();
            DeliverImpl deliverImpl = new DeliverImpl();

            //test   
            System.out.println("nid  " + ne.getnid());
            System.out.println("content  "+ne.getContent());
            System.out.println("fid  "+de.getFid());
            System.out.println("nid  "+de.getNid());
            System.out.println("uid  "+de.getUid());
            System.out.println("date  "+de.getDate());

           noteImpl.insert(connection, ne, de);
            connection.commit();
        } catch (Exception ex) {
            Logger.getLogger(Test_inserttoNotable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
