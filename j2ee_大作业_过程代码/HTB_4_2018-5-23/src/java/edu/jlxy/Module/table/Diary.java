package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DiaryEntity;

public interface Diary {

	public void insert(Connection connection, DiaryEntity diaryEntity) throws SQLException;

	public void update(Connection connection, DiaryEntity diaryEntity) throws SQLException;

	public void delete(Connection connection, DiaryEntity diaryEntity) throws SQLException;

	public ResultSet query(Connection con, DiaryEntity diaryEntity) throws SQLException;

}
