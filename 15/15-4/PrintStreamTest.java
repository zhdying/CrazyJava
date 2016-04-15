
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
public class PrintStreamTest
{
	public static void main(String[] args)throws IOException
	{
		PrintStream ps = null;
		try
		{
			//����һ���ڵ��������FileOutputStream
			FileOutputStream fos = new FileOutputStream("test.txt");
			//��PrintStream����װFileOutputStream�����
			ps = new PrintStream(fos);
			//ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			ps.println(new PrintStreamTest());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace(ps);
		}
		finally
		{
			ps.close();
		}
	}
}
