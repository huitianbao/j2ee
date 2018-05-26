package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DynamicEntity;

public interface Dynamic {

	public void insert(Connection connection, DynamicEntity dynamicEntity) throws SQLException;

	public void update(Connection connection, DynamicEntity dynamicEntity) throws SQLException;

	public void delete(Connection connection, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryOneRow(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryUserId(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryTitle(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryContent(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryPhoto(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryDate(Connection con, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryPermission(Connection con, DynamicEntity dynamicEntity) throws SQLException;

}
