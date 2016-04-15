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
public class PreparedStatementTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;

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

	public void insertUseStatement()throws Exception
	{
		long start = System.currentTimeMillis();
		try
		{
			//ʹ��Connection������һ��Statment����
			stmt = conn.createStatement();
			//��Ҫʹ��100��SQL���������100����¼
			for (int i = 0; i < 100 ; i++ )
			{
				stmt.executeUpdate("insert into student_table values(null,'����"
					+ i + "',1)");
			}
			System.out.println("ʹ��Statement��ʱ:" + (System.currentTimeMillis() - start));
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (stmt != null)
			{
				stmt.close();
			}
		}
	}

	public void insertUsePrepare()throws Exception
	{
		long start = System.currentTimeMillis();
		try
		{
			//ʹ��Connection������һ��PreparedStatment����
			pstmt = conn.prepareStatement("insert into student_table values(null,?,1)");
			//100��ΪPreparedStatement�Ĳ������ã��Ϳ��Բ���100����¼
			for (int i = 0; i < 100 ; i++ )
			{
				pstmt.setString(1 , "����" + i);
				pstmt.executeUpdate();
			}
			System.out.println("ʹ��PreparedStatement��ʱ:" + (System.currentTimeMillis() - start));
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (pstmt != null)
			{
				pstmt.close();
			}
		}

	}
	//��������ӵķ���
	public void getConn()throws Exception
	{
		if (conn == null)
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
		}
	}
	//����ر����ӵķ���
	public void closeConn()throws Exception
	{
		if (conn != null)
		{
			conn.close();
		}
	}

	public static void main(String[] args) throws Exception
	{
		PreparedStatementTest pt = null;
		try
		{
			pt = new PreparedStatementTest();
			pt.initParam("mysql.ini");
			pt.getConn();
			pt.insertUseStatement();
			pt.insertUsePrepare();
		}
		finally
		{
			pt.closeConn();
		}
	}
}