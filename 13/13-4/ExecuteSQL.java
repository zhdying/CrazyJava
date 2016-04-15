import java.sql.*;
import java.util.*;
import java.io.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ExecuteSQL
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	public void initParam(String paramFile)throws Exception
	{
		//ʹ��Properties�������������ļ�
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}

	public void executeSql(String sql)throws Exception
	{
		try
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��Statment����
			stmt = conn.createStatement();
			//ִ��SQL,����booleanֵ��ʾ�Ƿ����ResultSet
			boolean hasResultSet = stmt.execute(sql);
			//���ִ�к���ResultSet�����
			if (hasResultSet)
			{
				//��ȡ�����
				rs = stmt.getResultSet();
				//ResultSetMetaData�����ڷ����������Ԫ���ݽӿ�
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				//�������ResultSet����
				while (rs.next())
				{
					//�������ÿ�е�ֵ
					for (int i = 0 ; i < columnCount ; i++ )
					{
						System.out.print(rs.getString(i + 1) + "\t");
					}
					System.out.print("\n");
				}
			}
			else
			{
				System.out.println("��SQL���Ӱ��ļ�¼��" + stmt.getUpdateCount() + "��");
			}
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (rs != null)
			{
				rs.close();
			}
			if (stmt != null)
			{
				stmt.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		ExecuteSQL es = new ExecuteSQL();
		es.initParam("mysql.ini");
		System.out.println("------ִ��ɾ�����DDL���-----");
		es.executeSql("drop table if exists my_test");
		System.out.println("------ִ�н����DDL���-----");
		es.executeSql("create table my_test"
			+ "(test_id int auto_increment primary key, "
			+ "test_name varchar(255))");
		System.out.println("------ִ�в������ݵ�DML���-----");
		es.executeSql("insert into my_test(test_name) "
			+ "select student_name from student_table");
		System.out.println("------ִ�в�ѯ���ݵĲ�ѯ���-----");
		es.executeSql("select * from my_test");

	}
}