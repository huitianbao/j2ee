package com.jlxy.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	public Connection getCon(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost/jkstudent?useUnicode=true&characterEncoding=utf-8";
			String user="root";
			String password="htbwjj123";
			Connection conn=DriverManager.getConnection(url, user, password);
			System.out.println(conn.getMetaData().getURL());
			return conn;
		}
		
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}
