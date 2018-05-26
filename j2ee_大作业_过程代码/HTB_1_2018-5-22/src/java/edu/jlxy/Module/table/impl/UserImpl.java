package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.User;

public class UserImpl implements User {

	@Override
	public void insert(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO usertable" + "(userId,password,realname,age,occupation) VALUES(?,?,?,?,?)");
		pStatement.setString(1, userentity.getUserId());
		pStatement.setString(2, userentity.getPassword());
		pStatement.setString(3, userentity.getRealname());
		pStatement.setInt(4, userentity.getAge());
		pStatement.setString(5, userentity.getOccupation());
		pStatement.execute();

	}

	@Override
	public void update(Connection connection, UserEntity userentity) throws SQLException {
		String updateSqlString = "UPDATE usertable SET password=?,realname=?,age=?,occupation=? WHERE userId=?";
		PreparedStatement pStatement = connection.prepareStatement(updateSqlString);
		pStatement.setString(1, userentity.getPassword());
		pStatement.setString(2, userentity.getRealname());
		pStatement.setInt(3, userentity.getAge());
		pStatement.setString(4, userentity.getOccupation());
		pStatement.setString(5, userentity.getUserId());
		pStatement.execute();

	}

	@Override
	public void delete(Connection connection, UserEntity userentity) throws SQLException {

		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "usertable WHERE userId=?");
		pStatement.setString(1, userentity.getUserId());
		pStatement.execute();

	}

	@Override
	public ResultSet queryAll(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM usertable");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		return resultSet;
	}
	public ResultSet queryOneRow(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());
		return preparedStatement.executeQuery();
	}

	public ResultSet queryUserId(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT userId FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	public ResultSet queryPassword(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT password FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());

		return preparedStatement.executeQuery();
	}

	public ResultSet queryRealname(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT realname FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());

		return preparedStatement.executeQuery();
	}

	public ResultSet queryOccupation(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT occupation FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());

		return preparedStatement.executeQuery();
	}

	public ResultSet queryAge(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT age FROM usertable WHERE userId=?");
		preparedStatement.setString(1, userentity.getUserId());

		return preparedStatement.executeQuery();
	}

}
