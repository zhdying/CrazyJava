import java.io.*;
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class InsertContent
{
	public static void insert(String fileName , long pos , 
		String insertContent)throws IOException
	{
		RandomAccessFile raf = null;
		//����һ����ʱ�ļ�����������������
		File tmp = File.createTempFile("tmp" , null);
		FileOutputStream tmpOut = null;
		FileInputStream tmpIn = null;
		tmp.deleteOnExit();
		try
		{
			raf = new RandomAccessFile(fileName , "rw");
			tmpOut = new FileOutputStream(tmp);
			tmpIn = new FileInputStream(tmp);
			raf.seek(pos);
			//--------������뽫����������ݶ�����ʱ�ļ��б���---------
			byte[] bbuf = new byte[64];
			//���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			//ʹ��ѭ����ʽ��ȡ�����������
			while ((hasRead = raf.read(bbuf)) > 0 )
			{
				//����ȡ������д����ʱ�ļ�
				tmpOut.write(bbuf , 0 , hasRead);
			}
			//----------��������������----------
			//���ļ���¼ָ�����¶�λ��posλ��
			raf.seek(pos);
			//׷����Ҫ���������
			raf.write(insertContent.getBytes());
			//׷����ʱ�ļ��е�����
			while ((hasRead = tmpIn.read(bbuf)) > 0 )
			{
				raf.write(bbuf , 0 , hasRead);
			}
		}
		finally
		{
			raf.close();
		}
	}
	public static void main(String[] args) throws IOException
	{
		insert("InsertContent.java" , 45 , "���������\r\n");
	}
}
