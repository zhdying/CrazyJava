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
public class TransactionTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	Statement stmt;
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
	public void insertInTransaction(String[] sqls)throws Exception
	{
		try
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//�ر��Զ��ύ����������
			conn.setAutoCommit(false);
			//ʹ��Connection������һ��Statment����
			stmt = conn.createStatement();
			for (String sql : sqls)
			{
				stmt.executeUpdate(sql);
			}
			//�ύ����
			conn.commit();
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
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
		TransactionTest tt = new TransactionTest();
		tt.initParam("mysql.ini");
		String[] sqls = new String[]{
			"insert into student_table values(null , 'aaa' ,1)",
			"insert into student_table values(null , 'bbb' ,1)",
			"insert into student_table values(null , 'ccc' ,1)",
			//��������SQL��佫��Υ�����Լ����
			//��Ϊteacher_table��û��IDΪ5�ļ�¼��
			"insert into student_table values(null , 'ccc' ,5)"
		};
		tt.insertInTransaction(sqls);
	}
}
