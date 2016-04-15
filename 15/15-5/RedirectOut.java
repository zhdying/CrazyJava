
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
public class RedirectOut
{
	public static void main(String[] args) 
	{
		PrintStream ps = null;
		try
		{
			ps = new PrintStream(new FileOutputStream("out.txt"));
			//����׼����ض���ps�����
			System.setOut(ps);
			//���׼������һ���ַ���
			System.out.println("��ͨ�ַ���");
			//���׼������һ������
			System.out.println(new RedirectOut());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (ps != null)
			{
				ps.close();
			}
		}
	}
}
