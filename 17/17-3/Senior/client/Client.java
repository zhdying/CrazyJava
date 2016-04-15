
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Client
{
	private static final int SERVER_PORT = 30000;

	private Socket socket;
	private PrintStream ps;
	private BufferedReader brServer;
	private	BufferedReader keyIn;
	public void init()
	{
		try
		{
			//��ʼ��������̵�������
			keyIn = new BufferedReader(
				new InputStreamReader(System.in));
			//���ӵ�������
			socket = new Socket("127.0.0.1", SERVER_PORT);
			//��ȡ��Socket��Ӧ���������������
			ps = new PrintStream(socket.getOutputStream());
			brServer = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
			String tip = "";
			//����ѭ�����ϵص����Ի���Ҫ�������û���
			while(true)
			{
				String userName = JOptionPane.showInputDialog(tip + "�����û���");
				//���û�������û�����ǰ������Э���ַ�������
				ps.println(YeekuProtocol.USER_ROUND + userName
					+ YeekuProtocol.USER_ROUND);
				//��ȡ����������Ӧ
				String result = brServer.readLine();
				//����û��ظ�����ʼ�´�ѭ��
				if (result.equals(YeekuProtocol.NAME_REP))
				{
					tip = "�û����ظ���������";
					continue;
				}
				//������������ص�½�ɹ�������ѭ��
				if (result.equals(YeekuProtocol.LOGIN_SUCCESS))
				{
					break;
				}
			}
		}
		//��׽���쳣���ر�������Դ�����˳��ó���
		catch (UnknownHostException ex)
		{
			System.out.println("�Ҳ���Զ�̷���������ȷ���������Ѿ�������");
			closeRs();
			System.exit(1);
		}
		catch (IOException ex)
		{
			System.out.println("�����쳣�������µ�½��");
			closeRs();
			System.exit(1);
		}
		//�Ը�Socket��Ӧ������������ClientThread�߳�
		new ClientThread(brServer).start();
	}
	//����һ����ȡ����������������緢�͵ķ���
	private void readAndSend()
	{
		try
		{
			//���϶�ȡ��������
			String line = null;
			while((line = keyIn.readLine()) != null)
			{
				//������͵���Ϣ����ð�ţ�����//��ͷ������Ϊ�뷢��˽����Ϣ
				if (line.indexOf(":") > 0 && line.startsWith("//"))
				{
					line = line.substring(2);
					//ð��֮ǰ����˽���û���ð��֮�����������Ϣ
					ps.println(YeekuProtocol.PRIVATE_ROUND + 
						line.split(":")[0] + YeekuProtocol.SPLIT_SIGN + 
						line.split(":")[1] + YeekuProtocol.PRIVATE_ROUND);
				}
				else
				{
					ps.println(YeekuProtocol.MSG_ROUND + line
						+ YeekuProtocol.MSG_ROUND);
				}
			}
		}
		//��׽���쳣���ر�������Դ�����˳��ó���
		catch (IOException ex)
		{
			System.out.println("����ͨ���쳣�������µ�½��");
			closeRs();
			System.exit(1);
		}
	}

	//�ر�Socket����������������ķ���
	private void closeRs()
	{
		try
		{
			if (keyIn != null)
			{
				ps.close();
			}
			if (brServer != null)
			{
				ps.close();
			}
			if (ps != null)
			{
				ps.close();
			}
			if (socket != null)
			{
				keyIn.close();
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

    public static void main(String[] args)
    {
		Client client = new Client();
		client.init();
		client.readAndSend();
    }
}
