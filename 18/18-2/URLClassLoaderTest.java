import java.net.*;
import java.sql.*;
import java.util.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class URLClassLoaderTest
{
	private static Connection conn;
	//����һ����ȡ���ݿ����ӷ���
	public static Connection getConn(String url , 
		String user , String pass)throws Exception
	{
		if (conn == null)
		{
			//����һ��URL����
			URL[] urls = {new URL("file:mysql-connector-java-3.1.10-bin.jar")};
			//��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
			URLClassLoader myClassLoader = new URLClassLoader(urls);
			//����MySQL��JDBC������������Ĭ��ʵ��
			Driver driver = (Driver)myClassLoader.
				loadClass("com.mysql.jdbc.Driver").newInstance();
			//����һ������JDBC�������Ե�Properties����
			Properties props = new Properties();
			//������ҪΪ�ö�����user��password��������
			props.setProperty("user" , user);
			props.setProperty("password" , pass);
			//����Driver�����connect������ȡ�����ݿ�����
			conn = driver.connect("jdbc:mysql://localhost:3306/mysql" , props);
		}
		return conn;
	}
	public static void main(String[] args)throws Exception
	{
		System.out.println(getConn(
			"jdbc:mysql///mysql"
			, "root" , "32147"));
	}
}
