package edu.jlxy.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory FACTORY = new ConnectionFactory();

	public ConnectionFactory() {
            
	}

	private Connection connection = null;
	//静态代码块，编译时仅执行一次�
	static {
			// Properties类用于访问配置文件中的键值对�
		Properties properties = new Properties();
		try {
			InputStream inputStream = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
	// 从输入流中读取属性列表
			properties.load(inputStream);
		} catch (Exception e) {
			
			System.out.println();
			System.out.println("====配置文件读取错误=====");
			
		}
		
			driver = properties.getProperty("driver");
			System.out.println(driver);
			dburl = properties.getProperty("dburl");
			System.out.println(dburl);
			user = properties.getProperty("user");
			System.out.println(user);
			password = properties.getProperty("password");
			System.out.println(password);
		
		
	}

	// 获取一个ConnectionFactory的实例，保证程序运行期间只有一个ConnectionFactory实例存在
	public static ConnectionFactory getInstance() {
		return FACTORY;
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(dburl, user, password);
			System.out.println("====数据库连接成功=====");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
