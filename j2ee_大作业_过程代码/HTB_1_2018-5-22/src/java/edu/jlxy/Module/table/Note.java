package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.NoteEntity;

public interface Note {
	public void insert(Connection connection, NoteEntity noteEntity) throws SQLException;

	public void update(Connection connection, NoteEntity noteEntity) throws SQLException;

	public void delete(Connection connection, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryAll(Connection con, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryOneRow(Connection con, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryUserId(Connection con, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryFriendId(Connection con, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryContent(Connection con, NoteEntity noteEntity) throws SQLException;

	public ResultSet queryDate(Connection con, NoteEntity noteEntity) throws SQLException;

}
