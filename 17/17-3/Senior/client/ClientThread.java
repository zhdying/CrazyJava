
import java.io.*;
import java.net.*;
import java.util.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class ClientThread extends Thread
{
	//�ÿͻ����̸߳������������
	BufferedReader br = null;
	//ʹ��һ�������������������ͻ����߳�
	public ClientThread(BufferedReader br)
	{
		this.br = br;
	}
	public void run()
	{
		try
		{
			String line = null;
			//���ϴ��������ж�ȡ���ݣ�������Щ���ݴ�ӡ���
			while((line = br.readLine())!= null)
			{
				System.out.println(line);
				/*
				 ��������ӡ�˴ӷ������˶��������ݡ�ʵ���ϣ��˴���������Ը����ӣ�
				 �������ϣ���ͻ����ܿ��������ҵ��û��б�������÷�������
				 ÿ�����û���½���û��˳�ʱ���������û��б���Ϣ����ͻ��˷���һ�顣
				 Ϊ�����ַ��������͵���������Ϣ�������û��б�������ҲӦ��
				 ��Ҫ���͵���Ϣǰ�������һ����Э���ַ������ͻ��˴˴������Э��
				 �ַ����Ĳ�ͬ�����в�ͬ�Ĵ���
				 �����ӵ������
				 ������˽�����Ϸ�����п��ܷ�����Ϸ��Ϣ���������˽�����������Ϸ��
				 ����Ҫ��������������Ϣ�ȣ�������ͬ������Щ����������Ϣǰ����
				 ���Э���ַ������ٷ��ͣ��ͻ��˾Ϳ��Ը��ݸ���Ϣ֪�����ֵ��������ꡣ
				 */
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		//ʹ��finally�����رո��̶߳�Ӧ��������
		finally
		{
			try
			{
				if (br != null)
				{
					br.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
