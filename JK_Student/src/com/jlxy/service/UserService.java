package com.jlxy.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jlxy.beans.Usertable;

public class UserService {
	private Connection conn;
	private PreparedStatement pstmt=null;
	public UserService(){
		conn=new com.jlxy.conn.Conn().getCon();
		
		
		
		
	}
	
	public boolean valiUser(Usertable user){
		try {
			 pstmt= conn.prepareStatement("select * from usertable where username=? and password=?");
			 pstmt.setString(1, user.getUsername());
			 pstmt.setString(2, user.getPassword());
			 ResultSet re=pstmt.executeQuery();
			 if(re.next()){
				 return true;
			 }else{
				 return false;
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

}
