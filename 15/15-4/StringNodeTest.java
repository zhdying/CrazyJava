
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
public class StringNodeTest
{
	public static void main(String[] args) 
	{
		String src = "����������һ���Ҹ�����\n"
			+ "ι��������������\n"
			+ "�������𣬹�����ʳ���߲�\n"
			+ "����һ�����ӣ��泯�󺣣���ů����\n"
			+ "�������𣬺�ÿһ������ͨ��\n"
			+ "���������ҵ��Ҹ�\n";
		StringReader sr = new StringReader(src);
		char[] buffer = new char[32];
		int hasRead = 0;
		try
		{
			//����ѭ����ȡ�ķ��ʶ�ȡ�ַ���
			while((hasRead = sr.read(buffer)) > 0)
			{
				System.out.print(new String(buffer ,0 , hasRead));
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			sr.close();
		}
		//����StringWriterʱ��ʵ������һ��StringBuffer��Ϊ����ڵ�
		//����ָ����20����StringBuffer�ĳ�ʼ����
		StringWriter sw = new StringWriter(20); 
		//����StringWriter�ķ���ִ�����
		sw.write("��Զ���˴󺣣�\n");
		sw.write("��������ů����,\n");
		sw.write("��ֻ��һֻС�꣬\n");
		sw.write("һ�������ŵ��������\n");
		System.out.println("------������sw���ַ����ڵ��������------:");
		//ʹ��toString��������StringWriter���ַ����ڵ������
		System.out.println(sw.toString());
	}
}
