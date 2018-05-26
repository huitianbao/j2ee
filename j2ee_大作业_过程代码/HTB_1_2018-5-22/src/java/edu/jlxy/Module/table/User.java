package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.UserEntity;

public interface User {
	public void insert(Connection connection, UserEntity userentity) throws SQLException;

	public void update(Connection connection, UserEntity userentity) throws SQLException;

	public void delete(Connection connection, UserEntity userentity) throws SQLException;

	public ResultSet queryAll(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryOneRow(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryUserId(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryPassword(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryRealname(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryOccupation(Connection con, UserEntity userentity) throws SQLException;

}
