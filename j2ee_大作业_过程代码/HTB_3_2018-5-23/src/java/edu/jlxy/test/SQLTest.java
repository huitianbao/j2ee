package edu.jlxy.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.xml.sax.Parser;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.DynamicImpl;
import edu.jlxy.Module.table.impl.FriendImpl;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class SQLTest {

    public static void main(String[] args) {
        ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
        Connection connection = null;
        connection = ConnectionFactory.getInstance().makeConnection();

        try {
            connection.setAutoCommit(false);
//			
            ResultSet rset;
//			UserImpl userImpl=new UserImpl();
//			rset=userImpl.queryAllUId(connection);
//			resultSetUtil.showResultSet(rset, 1);
//			rset.beforeFirst();
//			System.out.println(resultSetUtil.isRepat("1", rset));

            DynamicEntity dynamicEntity = new DynamicEntity();
            ShareEntity shareEntity = new ShareEntity();
            DynamicImpl dynamicImpl = new DynamicImpl();
            dynamicEntity.setAllInfo("sadjs", "djoas", null);
            shareEntity.setAllInfo("1", "7", null);
            dynamicImpl.delete(connection, dynamicEntity, shareEntity);

//			rset.last();
//			String data=rset.getString("uid");
//			System.out.println(data);
//			resultSetUtil.showResultSet(rset, 1);
//			System.out.println(resultSetUtil.isRepat("1", rset));
        } catch (Exception e) {
            try {
                e.printStackTrace();
                connection.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("=======连接关闭！=======");
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
