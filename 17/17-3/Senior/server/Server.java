import java.net.*;
import java.io.*;
import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Server 
{
	private static final int SERVER_PORT = 30000;
	//ʹ��MyMap����������ÿ���ͻ����ֺͶ�Ӧ�����֮��Ķ�Ӧ��ϵ��
	public static YeekuMap<String , PrintStream> clients =
		new YeekuMap<String , PrintStream>();
	public void init()
	{
		ServerSocket ss = null;
		try
		{
			//����������ServerSocket
			ss = new ServerSocket(SERVER_PORT);
			//������ѭ�������Ͻ������Կͻ��˵�����
			while(true)
			{
				Socket socket = ss.accept();
				new ServerThread(socket).start();
			}
		}
		//����׳��쳣
		catch (IOException ex)
		{
			System.out.println("����������ʧ�ܣ��Ƿ�˿�" 
				+ SERVER_PORT + "�ѱ�ռ�ã�");
		}
		//ʹ��finally�����ر���Դ
		finally
		{
			try
			{
				if (ss != null)
				{
					ss.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
			System.exit(1);
		}
	}
    public static void main(String[] args)
    {
		Server server = new Server();
		server.init();
    }
}