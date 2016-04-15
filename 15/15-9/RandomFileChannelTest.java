
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class RandomFileChannelTest
{
	public static void main(String[] args)
	{
		FileChannel randomChannel = null;
		try
		{
			File f = new File("a.txt");
			//����һ��RandomAccessFile����
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			//��ȡRandomAccessFile��Ӧ��Channel
			randomChannel = raf.getChannel();
			//��Channel����������ӳ���ByteBuffer
			ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY,
				0 , f.length());
			//��Channel�ļ�¼ָ���ƶ������
			randomChannel.position(f.length());
			//��buffer�������������
			randomChannel.write(buffer);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if (randomChannel != null)
					randomChannel.close();
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
