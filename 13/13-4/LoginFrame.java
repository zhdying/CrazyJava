
import java.sql.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class LoginFrame
{
	private final String PROP_FILE = "mysql.ini";

	//driver�����ݿ�������,ͨ���������ĵ��õ�
	private String driver;
	//url�����ݿ�ķ����ַ
	private String url;
	private String user;
	private String pass;
	//��½�����GUI���
	private JFrame jf = new JFrame("��½");
	private JTextField userField = new JTextField(20);
	private JTextField passField = new JTextField(20);
	private JButton loginButton = new JButton("��½");
	//ִ��JDBC�����Ķ���
	private Connection conn;
	private	Statement stmt;
	private	PreparedStatement pstmt;
	private ResultSet rs;

	public void init()throws Exception
	{
		Properties connProp = new Properties();
		connProp.load(new FileInputStream(PROP_FILE));
		driver = connProp.getProperty("driver");
		url = connProp.getProperty("url");
		user = connProp.getProperty("user");
		pass = connProp.getProperty("pass");
		//Ϊ��½��ť����¼�������
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//��½�ɹ�����ʾ"��½�ɹ�"
				if (validate(userField.getText(), passField.getText()))
				{
					JOptionPane.showMessageDialog(jf, "��½�ɹ�");
				}
				//������ʾ"��½ʧ��"
				else
				{
					JOptionPane.showMessageDialog(jf, "��½ʧ��");
				}
			}
		});
		jf.add(userField , BorderLayout.NORTH);
		jf.add(passField);
		jf.add(loginButton , BorderLayout.SOUTH);
		jf.pack();
		jf.setVisible(true);
	}

//	private boolean validate(String userName, String userPass)
//	{
//		try
//		{
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url , user ,pass);
//			stmt = conn.createStatement();
//			String sql = "select * from jdbc_test "
//				+ "where jdbc_name='" + userName 
//				+ "' and jdbc_desc='" + userPass + "'";
//			System.out.println(sql);
//			//�����ѯ��ResultSet���г���һ���ļ�¼�����½�ɹ�
//			if (stmt.executeQuery(sql).next())
//			{
//				return true;
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				if (rs != null)
//				{
//					rs.close();
//				}
//				if (stmt != null)
//				{
//					stmt.close();
//				}
//				if (conn != null)
//				{
//					conn.close();
//				}				
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		return false;
//	}

	private boolean validate(String userName, String userPass)
	{
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url , user ,pass);
			pstmt = conn.prepareStatement("select * from jdbc_test "
				+ "where jdbc_name=? and jdbc_desc=?");
			pstmt.setString(1, userName);
			pstmt.setString(2, userPass);
			//�����ѯ��ResultSet���г���һ���ļ�¼�����½�ɹ�
			if (pstmt.executeQuery().next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
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
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return false;
	}


    public static void main(String[] args) throws Exception
    {
		new LoginFrame().init();
    }
}
