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
public class CallableStatementTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	CallableStatement cstmt;

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

	public void callProcedure()throws Exception
	{
		try
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��CallableStatment����
			cstmt = conn.prepareCall("{call add_pro(?,?,?)}");
			cstmt.setInt(1, 4);
			cstmt.setInt(2, 5);
			//ע��CallableStatement�ĵ�����������int����
			cstmt.registerOutParameter(3, Types.INTEGER);
			//ִ�д洢����
			cstmt.execute();
			//��ȡ��������洢���̴���������ֵ��
            System.out.println("ִ�н����: " + cstmt.getInt(3));
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (cstmt != null)
			{
				cstmt.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		CallableStatementTest ct = new CallableStatementTest();
		ct.initParam("mysql.ini");
		ct.callProcedure();
	}
}