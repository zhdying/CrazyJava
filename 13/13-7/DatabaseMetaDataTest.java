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
public class DatabaseMetaDataTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
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
	public void info()throws Exception
	{
		try
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//��ȡ��DatabaseMetaData����
			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println(dbmd.getDatabaseProductName()
				+ dbmd.getDatabaseProductVersion() );
			
			System.out.println(dbmd.getDriverName());
			//��ȡMySQL֧�ֵ����б�����
			ResultSet rs = dbmd.getTableTypes();
			System.out.println("----MySQL֧�ֵı�������Ϣ------");
			printResultSet(rs);
			//��ȡ��ǰ���ݿ��ȫ�����ݱ�
			rs = dbmd.getTables(null,null, "%" , new String[]{"TABLE"});
			System.out.println("----��ǰ���ݿ�������ݱ���Ϣ-----");
			printResultSet(rs);
			//��ȡstudent_table�������			
			rs = dbmd.getPrimaryKeys(null , null, "student_table");  
			System.out.println("----student_table���������Ϣ-----");
			printResultSet(rs);
			//��ȡ��ǰ���ݿ��ȫ���洢����
			rs = dbmd.getProcedures(null , null, "%");
			System.out.println("----��ǰ���ݿ���Ĵ洢������Ϣ-----");
			printResultSet(rs);
			//��ȡteacher_table���student_table֮������Լ��
			rs = dbmd.getCrossReference(null,null, "teacher_table", null, null, "student_table");
			System.out.println("----teacher_table���student_table֮������Լ��-----");
			printResultSet(rs);
			//��ȡstudent_table���ȫ��������
			rs = dbmd.getColumns(null, null, "student_table", "%"); 
			System.out.println("----student_table���ȫ��������-----");
			printResultSet(rs);
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (rs != null)
			{
				rs.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}
	}

	public void printResultSet(ResultSet rs)throws SQLException
	{
		ResultSetMetaData rsmd = rs.getMetaData();
		//��ӡResultSet�������б���
		for (int i = 0 ; i < rsmd.getColumnCount() ; i++ )
		{
			System.out.print(rsmd.getColumnName(i + 1) + "\t");
		}
		System.out.print("\n");
		//��ӡResultSet���ȫ������
		while (rs.next())
		{
			for (int i = 0; i < rsmd.getColumnCount() ; i++ )
			{
				System.out.print(rs.getString(i + 1) + "\t");
			}
			System.out.print("\n");
		}
		rs.close();
	}

	public static void main(String[] args) throws Exception
	{
		DatabaseMetaDataTest dt = new DatabaseMetaDataTest();
		dt.initParam("mysql.ini");
		dt.info();
	}
}
