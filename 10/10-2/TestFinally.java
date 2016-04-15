
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
public class TestFinally
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.txt");	
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			//return���ǿ�Ʒ�������
			//return ;
			//ʹ��exit���˳������
			System.exit(1);
		}
		finally
		{
			//�رմ����ļ���������Դ
			if (fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace();
				}
			}
			System.out.println("�����Ѿ�ִ����finally�����Դ����!");
		}
	}
}
