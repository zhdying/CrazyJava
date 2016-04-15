
import java.net.*;
import java.io.*;
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
public class Server
{
	public static void main(String[] args) 
		throws Exception
	{
		ServerSocket ss = new ServerSocket(30000);
		Socket socket = ss.accept();
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println("�������ĵ�һ������");
		ps.println("�������ĵڶ�������");
		//�ر�socket���������������������Ѿ�����
		socket.shutdownOutput();
		//������佫���false������socket��δ�رա�
		System.out.println(socket.isClosed());
		Scanner scan = new Scanner(socket.getInputStream());
		if (scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		scan.close();
		socket.close();
		ss.close();
	}
}
