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
public class FileWriterTest
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = null;
		try
		{
			//�����ַ������
			fw = new FileWriter("poem.txt");
			fw.write("��ɪ - ������\r\n"); 
			fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			//ʹ��finally�����ر��ļ������
			if (fw != null)
			{
				fw.close();
			}
		}
	}
}
