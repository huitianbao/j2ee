package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.table.Friend;

public class FriendImpl implements Friend {

	@Override
	public void insert(Connection connection, FriendEntity friendEntity) throws SQLException {
		
		PreparedStatement pStatement = connection.prepareCall("INSERT INTO friendtable"
				+ "(userId,friendId,label1,label2,label3,label4,label5) VALUES(?,?,?,?,?,?,?)");
		pStatement.setString(1, friendEntity.getUserId());
		pStatement.setString(2, friendEntity.getFriendId());
		pStatement.setString(3, friendEntity.getLabel1());
		pStatement.setString(4, friendEntity.getLabel2());
		pStatement.setString(5, friendEntity.getLabel3());
		pStatement.setString(6, friendEntity.getLabel4());
		pStatement.setString(7, friendEntity.getLabel5());
		boolean bl;
		bl = pStatement.execute();
		if (bl) {
			System.out.println("=====插入了一条数据=====");
		} else {
			System.out.println("=====太惨了，插入失败=====");
		}

	}

	@Override
	public void update(Connection connection, FriendEntity friendEntity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall(
				"UPDATE friendtable SET userId=?,label1=?,label2=?,label3=?,label4=?,label5=? WHERE friendId=?");
		pStatement.setString(1, friendEntity.getUserId());
		pStatement.setString(2, friendEntity.getLabel1());
		pStatement.setString(3, friendEntity.getLabel2());
		pStatement.setString(4, friendEntity.getLabel3());
		pStatement.setString(5, friendEntity.getLabel4());
		pStatement.setString(6, friendEntity.getLabel5());
		pStatement.setString(7, friendEntity.getFriendId());
		boolean bl;
		bl = pStatement.execute();
		if (bl) {
			System.out.println("=====更新成功=====");
		} else {
			System.out.println("=====太惨了，更新失败=====");
		}

	}

	@Override
	public void delete(Connection connection, FriendEntity friendEntity) throws SQLException {
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "friendtable WHERE friendId=?");
		pStatement.setString(1, friendEntity.getFriendId());
		boolean bl;
		bl = pStatement.execute();
		if (bl) {
			System.out.println("=====删除成功=====");
		} else {
			System.out.println("=====太惨了，删除失败=====");
		}

	}

	@Override
	public ResultSet queryAll(Connection con) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM friendtable");
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败======");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
		
	}

	@Override
	public ResultSet queryOneRow(Connection con, FriendEntity friendEntity) throws SQLException {
		// TODO �Զ����ɵķ������
//		if(resultSet==null){
//			System.out.println("=====太惨了，查询失败=====");
//			return null;
//		}else {
//			System.out.println("=====查询成功=====");
//			return resultSet;
//		}
		return null;
	}

	@Override
	public ResultSet queryUserId(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM friendId WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getFriendId());
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败=====");
			return null;
		}else {
			System.out.println("=====查询成功====");
			return resultSet;
		}
		
	}

	@Override
	public ResultSet queryFriendId(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT friendId FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getFriendId());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败=====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet querylabel1(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT label1 FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getLabel1());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败=====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet querylabel2(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT label2 FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getLabel2());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败=====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet querylabel3(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT label3 FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getLabel3());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet querylabel4(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT label4 FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getLabel4());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====太惨了，查询失败====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet querylabel5(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT label5 FROM friendtable WHERE friendId=?");
		preparedStatement.setString(1, friendEntity.getLabel5());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("====太惨了，查询失败====");
			return null;
		}else {
			System.out.println("=====查询成功=====");
			return resultSet;
		}
	}

}
