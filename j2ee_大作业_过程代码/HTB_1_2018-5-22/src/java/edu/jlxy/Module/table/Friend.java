package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.FriendEntity;



public interface Friend {
	public void insert(Connection connection, FriendEntity friendEntity) throws SQLException;

	public void update(Connection connection, FriendEntity friendEntity) throws SQLException;

	public void delete(Connection connection, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryAll(Connection con) throws SQLException;

	public ResultSet queryOneRow(Connection con, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryUserId(Connection con,FriendEntity friendEntity) throws SQLException;

	public ResultSet queryFriendId(Connection con, FriendEntity friendEntity) throws SQLException;

	public ResultSet querylabel1(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet querylabel2(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet querylabel3(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet querylabel4(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet querylabel5(Connection con, FriendEntity friendEntity) throws SQLException;

}
