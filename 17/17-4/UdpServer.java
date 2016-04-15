
import java.awt.*;
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
public class UdpServer
{
	public static final int PORT = 30000;
	//����ÿ�����ݱ�������СΪ4K
	private static final int DATA_LEN = 4096;
	//����÷�����ʹ�õ�DatagramSocket
	private DatagramSocket socket = null;
	//��������������ݵ��ֽ�����
	byte[] inBuff = new byte[DATA_LEN];
	//��ָ���ֽ����鴴��׼���������ݵ�DatagramPacket����
	private DatagramPacket inPacket = 
		new DatagramPacket(inBuff , inBuff.length);
	//����һ�����ڷ��͵�DatagramPacket����
	private DatagramPacket outPacket;
	//����һ���ַ������飬���������͸�����ĵ�Ԫ��
	String[] books = new String[]
	{
		"������J2EE��ҵӦ��ʵս",
		"����J2EE��Ajax����",
		"Struts2Ȩ��ָ��",
		"ROR���ݿ������ʵ��"
	};
	public void init()throws IOException
	{
		try
		{
			//����DatagramSocket����
			socket = new DatagramSocket(PORT);
			//����ѭ����������
			for (int i = 0; i < 1000 ; i++ )
			{
				//��ȡSocket�е����ݣ����������ݷ���inPacket����װ���ֽ������
				socket.receive(inPacket);
				//�ж�inPacket.getData()��inBuff�Ƿ���ͬһ������
				System.out.println(inBuff == inPacket.getData());
				//�����յ�������ת���ַ��������
				System.out.println(new String(inBuff ,
					0 , inPacket.getLength()));
				//���ַ���������ȡ��һ��Ԫ����Ϊ���͵�����
				byte[] sendData = books[i % 4].getBytes();
				//��ָ���ֽ�������Ϊ�������ݡ��Ըս��ܵ���DatagramPacket��
				//ԴSocketAddress��ΪĿ��SocketAddress����DatagramPacket��
				outPacket = new DatagramPacket(sendData ,
					sendData.length , inPacket.getSocketAddress());
				//��������
				socket.send(outPacket);	
			}
		}
		//ʹ��finally�鱣֤�ر���Դ
		finally
		{
			if (socket != null)
			{
				socket.close();
			}
		}
	}
	public static void main(String[] args) 
		throws IOException
	{
		new UdpServer().init();
	}
}
