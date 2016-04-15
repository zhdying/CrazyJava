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
public class KeyinTest
{
	public static void main(String[] args) 
	{
		BufferedReader br = null;
		try
		{
			//��Sytem.in����ת����Reader����
			InputStreamReader reader = new InputStreamReader(System.in);
			//����ͨReader��װ��BufferedReader
			br = new BufferedReader(reader);
			String buffer = null;
			//����ѭ����ʽ��һ��һ�еĶ�ȡ
			while ((buffer = br.readLine()) != null)
			{
				//�����ȡ���ַ���Ϊ"exit"�������˳�
				if (buffer.equals("exit"))
				{
					System.exit(1);
				}
				//��ӡ��ȡ������
				System.out.println("��������Ϊ:" + buffer);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		//�ر�������
		finally
		{
			try
			{
				br.close();				
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
		}
	}
}
