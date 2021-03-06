package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.Note;


public class NoteImpl implements Note{
	@Override
	public void insert(Connection connection, NoteEntity noteEntity, DeliverEntity deliverEntity) throws Exception {

		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO wehtb.notetable" + "(nid,content) VALUES(?,?)");
		pStatement.setString(1, noteEntity.getnid());
		pStatement.setString(2, noteEntity.getContent());
		

		//查询刚刚插入的nid
				ResultSet resultSet=queryNId(connection, noteEntity, deliverEntity);
				resultSet.last();
				String nid=resultSet.getString("nid");
				System.out.println(nid);  //此处输出的 nid 是 数据库中 notetable表中 最后一次插入的 nid
                                int real_nid=Integer.parseInt(nid)+1;  // 下一次 插入的时候应该加一
		

				//向deliver表中插入nid等信息
				 pStatement = connection
						.prepareCall("INSERT INTO wehtb.deliver" + "(uid,fid,nid,date) VALUES(?,?,?,?)");
				 	pStatement.setString(1, deliverEntity.getUid());
				 	pStatement.setString(1, deliverEntity.getFid());
					pStatement.setString(3,real_nid+"");  //  我觉得应该加一 才对  2018-5-23
					pStatement.setDate(4,deliverEntity.getDate());
					pStatement.execute();
			
		
		
	}
	//留言一般不需要更新
	@Override
	public void update(Connection connection, NoteEntity noteEntity, DeliverEntity deliverEntity) throws SQLException {
		
		
	}

	@Override
	public void delete(Connection connection, NoteEntity noteEntity, DeliverEntity deliverEntity) throws SQLException {
		
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "wehtb.deliver WHERE nid=? ");
		pStatement.setString(1,deliverEntity.getNid() );
		
		pStatement.execute();
		
		
		pStatement = connection.prepareStatement("DELETE FROM " + " wehtb.notetable WHERE nid=?");
		pStatement.setString(1, deliverEntity.getNid());
		pStatement.execute();
		
		
	}

	@Override
	public ResultSet queryAll(Connection con, NoteEntity noteEntity, DeliverEntity deliverEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM notetable ");
	 ResultSet resultSet=preparedStatement.executeQuery();
			return resultSet;
	}

	@Override
	public ResultSet queryOneRow(Connection con, NoteEntity noteEntity, DeliverEntity deliverEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM notetable WHERE nid=?");
		preparedStatement.setString(1, noteEntity.getnid());
		ResultSet resultSet=preparedStatement.executeQuery();
			return resultSet;
	}


	@Override
	public ResultSet queryAllContent(Connection con, NoteEntity noteEntity, DeliverEntity deliverEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("select uid,fid,content,date FROM deliver,notetable where deliver.nid=notetable.nid and fid=?;");

		preparedStatement.setString(1, deliverEntity.getUid());
	 ResultSet resultSet=preparedStatement.executeQuery();
			return resultSet;
	}

	@Override
	public ResultSet queryNId(Connection con, NoteEntity noteEntity, DeliverEntity deliverEntity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT nid FROM notetable ");
		 ResultSet resultSet=preparedStatement.executeQuery();
				return resultSet;
	}

	
	

}
