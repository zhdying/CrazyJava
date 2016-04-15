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
public class AppendContent
{
	public static void main(String[] args) 
	{
		RandomAccessFile raf = null;
		try
		{
			//�Զ���д��ʽ��һ��RandomAccessFile����
			raf = new RandomAccessFile("out.txt" , "rw");
			//����¼ָ���ƶ���out.txt�ļ������
			raf.seek(raf.length());
			raf.write("׷�ӵ����ݣ�\r\n".getBytes());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if (raf != null)
				{
					raf.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}

	}
}
