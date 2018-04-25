package com.ss.demo;

import java.sql.*;
import java.util.ResourceBundle;


public  class JDBCUtil {

	static ResourceBundle rb;
	static String url;
	static String user;
	static String password;
	static String driver;
	static Connection con;
	/**
	 * 静态块，类加载时即执行以下代码
	 * 优点:最快加载，而且只加载一次
	 */
	//加载位于src/mybatis.xml配置文件
	static{
		try {
			 rb = ResourceBundle.getBundle("db");//此处不要写 db.properties 。
	 		 url = rb.getString("url");
			 user = rb.getString("username");
			 password = rb.getString("password");
			 driver = rb.getString("driver");

			Class.forName(driver);

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 禁止未接通过new方法创建
	 * 因为上面的静态代码块在类每new一次时也会加载，这样会很多次加载耗费性能
	 */
	private JDBCUtil(){}
	
	
	//获取连接
	public static Connection getConnection(){
		con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("连接不到");
		}

		return con;
	}
	
	//关闭SqlSession与当前线程分开
	public static void closeConnection(ResultSet rs, PreparedStatement pre,Connection con){

			try {
				if(pre!=null)
					pre.close();
				if(rs!=null)
					rs.close();
				if(con!=null)
					con.close();
				System.out.println("释放资源成功。");
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}



	
	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnection();
		System.out.println(conn!=null?"连接成功":"连接失败");
	}
}
