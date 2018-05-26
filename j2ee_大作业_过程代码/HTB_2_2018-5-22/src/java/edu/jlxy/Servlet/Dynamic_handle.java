/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.table.impl.DynamicImpl;
import edu.jlxy.util.ConnectionFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 16221
 */
public class Dynamic_handle extends HttpServlet {
     private class DyInfor{
        private String title;
        private String content;
   
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        
        ArrayList<DyInfor> al=new ArrayList<>();
        al=getParamters(request, response);
        //System.out.println(title + "    " + content);
        
        // 下面开始插入到数据库中
        
        //  1  封装对象
        
        //(1)  封装 DynamicEntity 
        DynamicEntity dynamicEntity=new DynamicEntity();
        //dynamicEntity.setAllInfo(al.get(0), content, photoURL);
        
       // System.out.println(al.get(0).title+"   "+al.get(0).content);
       dynamicEntity.setAllInfo(al.get(0).title, al.get(0).content, null);
       
       
       //(2)   封装  
        ShareEntity shareEntity=new ShareEntity();
        
        //  uid  是当前登录用户 的  uid   登录的时候  把uid  保存在  session 当中，此时 取出
        //  did  应该是自增的  才对
        //  date   新建一个日期即可
        
        //    Date date1=new Date(System.currentTimeMillis());
          //  shareEntity.setAllInfo("11", "11", date1);
        String uid=this.getServletContext().getAttribute("currentuser").toString();
        //  需要获取  did
        String did=
        
        shareEntity.setAllInfo(uid, did, date2);
       
        DynamicImpl dynamicImpl=new DynamicImpl();
        dynamicImpl.insert(connection, dynamicEntity, shareEntity);
                
        
        
    }
   
    
    private ArrayList<DyInfor> getParamters(HttpServletRequest request,HttpServletResponse response){
        PrintWriter out = null;
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        // out = response.getWriter();
        // out.write(title + "    " + content);
        ArrayList<DyInfor> al=new ArrayList<>();
        DyInfor di=new DyInfor();
        di.content=content;
        di.title=title;
        al.add(di);
        return al;
     
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
