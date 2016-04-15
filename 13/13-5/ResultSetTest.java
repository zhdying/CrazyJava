import java.sql.*;
import java.util.*;
import java.io.*;

import static java.sql.ResultSet.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ResultSetTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	PreparedStatement pstmt;
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


	public void query(String sql)throws Exception
	{
		try
		{
			//��������
			Class.forName(driver);
			//��ȡ���ݿ�����
			conn = DriverManager.getConnection(url , user , pass);
			//ʹ��Connection������һ��PreparedStatement����
			//������ƽ�����ɹ������ɸ��µĲ�����
			pstmt = conn.prepareStatement(sql , ResultSet.TYPE_SCROLL_INSENSITIVE
				, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			rs.last();
			int rowCount = rs.getRow();
			for (int i = rowCount; i > 0 ; i-- )
			{
				rs.absolute(i);
				System.out.println(rs.getString(1) + "\t"
					+ rs.getString(2) + "\t" + rs.getString(3));
				//�޸ĵ�Ԫ����Ӧ��ֵ
				rs.updateString(2 , "ѧ����" + i);
				//�ύ�޸�
				rs.updateRow();
			}
		}
		//ʹ��finally�����ر����ݿ���Դ
		finally
		{
			if (rs != null)
			{
				rs.close();
			}
			if (pstmt != null)
			{
				pstmt.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		ResultSetTest rt = new ResultSetTest();
		rt.initParam("mysql.ini");
		rt.query("select * from student_table");
	}
}
