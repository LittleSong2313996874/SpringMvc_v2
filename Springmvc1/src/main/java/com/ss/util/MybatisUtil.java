package com.ss.util;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public  class MybatisUtil {

	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	private static SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 静态块，类加载时即执行以下代码
	 * 优点:最快加载，而且只加载一次
	 */
	//加载位于src/mybatis.xml配置文件
	static{
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * 禁止未接通过new方法创建
	 * 因为上面的静态代码块在类每new一次时也会加载，这样会很多次加载耗费性能
	 */
	private MybatisUtil(){}
	
	
	//获取SqlSession
	public static SqlSession getsqlSession(){
		//从当前线程中获取Sqlsession对象
		SqlSession sqlSession = threadLocal.get();
		//如果sqlSession对象为空
		if(sqlSession==null){
			//在sqlSessionFactory非空的情况下，获取sqlSession对象
			sqlSession = sqlSessionFactory.openSession();
			//将sqlSession对象与当前线程绑定在一起
			threadLocal.set(sqlSession);
			
		}
		return sqlSession;
	}
	
	//关闭SqlSession与当前线程分开
	public static void closesqlSession(){
		// 从当前线程中获取Sqlsession对象
		SqlSession sqlSession = threadLocal.get();
		// 如果sqlSession对象非空
		if (sqlSession != null) {
			//关闭SqlSession对象
			sqlSession.close();
			//分开当前线程与sqlsession对象的关系，为了让GC尽早回收
			threadLocal.remove();
			//或者threadLocal.set(null);
			
		}
	}
	
	public static void main(String[] args) {
		Connection conn = MybatisUtil.getsqlSession().getConnection();
		System.out.println(conn!=null?"连接成功":"连接失败");
	}
}
