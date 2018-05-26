package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.table.Dynamic;

public class DynamicImpl implements Dynamic{

	@Override
	public void insert(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO dynamictable" + "(userId,title,content,permission,photo,date) VALUES(?,?,?,?,?,?)");
		pStatement.setString(1, dynamicEntity.getUserId());
		pStatement.setString(2, dynamicEntity.getTitle());
		pStatement.setString(3, dynamicEntity.getContent());
		pStatement.setString(4, dynamicEntity.getPermission());
		pStatement.setString(5, dynamicEntity.getPhotoURL());
		pStatement.setString(6, dynamicEntity.getDate());
		boolean bl;
		bl = pStatement.execute();
		if (bl) {
			System.out.println("=====插入了一条数据=====");
		} else {
			System.out.println("=====太惨了，插入失败=====");
		}
		
		
	}

	@Override
	public void update(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		String updateSqlString = "UPDATE dynamictable SET title=?,content=?,permission=?,date=? WHERE userId=?";
		PreparedStatement pStatement = connection.prepareStatement(updateSqlString);
		pStatement.setString(5, dynamicEntity.getUserId());
		pStatement.setString(1, dynamicEntity.getTitle());
		pStatement.setString(2, dynamicEntity.getContent());
		pStatement.setString(3, dynamicEntity.getPermission());
		pStatement.setString(4, dynamicEntity.getDate());
		pStatement.execute();
		
	}

	@Override
	public void delete(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "dynamictable WHERE userId=?");
		pStatement.setString(1, dynamicEntity.getUserId());
		pStatement.execute();
		
	}

	

	@Override
	public ResultSet queryOneRow(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryUserId(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT userId FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryTitle(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT title FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryContent(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT content FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryPhoto(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT photo FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryDate(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT date FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryPermission(Connection connection, DynamicEntity dynamicEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT permission FROM dynamictable WHERE userId=?");
		preparedStatement.setString(1, dynamicEntity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

}
