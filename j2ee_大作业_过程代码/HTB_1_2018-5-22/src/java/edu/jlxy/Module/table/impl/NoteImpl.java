package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.Note;

public class NoteImpl implements Note{

	@Override
	public void insert(Connection connection, NoteEntity noteEntity) throws SQLException {
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO notetable" + "(userId,friendId,content,date) VALUES(?,?,?,?)");
		pStatement.setString(1, noteEntity.getUserId());
		pStatement.setString(2, noteEntity.getFriendId());
		pStatement.setString(3, noteEntity.getContent());
		pStatement.setString(4, noteEntity.getDate());
		
		
	}

	@Override
	public void update(Connection connection, NoteEntity noteEntity) throws SQLException {
		String updateSqlString = "UPDATE notetable SET content=?,date=? WHERE friendId=?";
		PreparedStatement pStatement = connection.prepareStatement(updateSqlString);
		
		pStatement.setString(3, noteEntity.getFriendId());
		pStatement.setString(1, noteEntity.getContent());
		pStatement.setString(2, noteEntity.getDate());
	}

	@Override
	public void delete(Connection connection, NoteEntity noteEntity) throws SQLException {
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "notetable WHERE friendId=?");
		pStatement.setString(1, noteEntity.getFriendId());
		pStatement.execute();
		
	}

	@Override
	public ResultSet queryAll(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM notetable ");
		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryOneRow(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM notetable WHERE friendId=?");
		preparedStatement.setString(1, noteEntity.getFriendId());
		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryUserId(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT userId FROM notetable WHERE friendId=?");
		preparedStatement.setString(1, noteEntity.getFriendId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryFriendId(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT friendId FROM notetable WHERE friendId=?");
		preparedStatement.setString(1, noteEntity.getFriendId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryContent(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT content FROM notetable WHERE friendId=?");
		preparedStatement.setString(1, noteEntity.getFriendId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryDate(Connection con, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT date FROM notetable WHERE friendId=?");
		preparedStatement.setString(1, noteEntity.getFriendId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	
	

}
