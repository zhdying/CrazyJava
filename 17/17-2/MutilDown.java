
import java.io.*;
import java.net.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
//�������ش�start��end�����ݵ��߳�
class DownThread extends Thread
{
	//�����ֽ����飨ȡˮ����Ͳ���ĳ���
	private final int BUFF_LEN = 32;
	//�������ص���ʼ��
	private long start;
	//�������صĽ�����
	private long end;
	//������Դ��Ӧ��������
	private InputStream is;
	//�����ص����ֽ������raf��
	private RandomAccessFile raf ;

	//���������������������������������ʼ�㡢������
	public DownThread(long start , long end 
		, InputStream is , RandomAccessFile raf)
	{
		//������̸߳������ص��ֽ�λ��
		System.out.println(start + "---->"  + end);
		this.start = start;
		this.end = end;
		this.is = is;
		this.raf = raf;
	}
	public void run()
	{
		try
		{
			is.skip(start);
			raf.seek(start); 
			//�����ȡ���������ݵĵĻ������飨��Ͳ��
			byte[] buff = new byte[BUFF_LEN];
			//���̸߳���������Դ�Ĵ�С
			long contentLen = end - start;
			//���������Ҫ��ȡ���ξͿ�����ɱ��̵߳�����
			long times = contentLen / BUFF_LEN + 4;
			//ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			for (int i = 0; i < times ; i++)
			{
				hasRead = is.read(buff);
				//�����ȡ���ֽ���С��0�����˳�ѭ����
				if (hasRead < 0)
				{
					break;
				}
				raf.write(buff , 0 , hasRead);
			}			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		//ʹ��finally�����رյ�ǰ�̵߳��������������
		finally
		{
			try
			{
				if (is != null)
				{
					is.close();
				}
				if (raf != null)
				{
					raf.close();
				}
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
public class MutilDown
{
	public static void main(String[] args)
	{
		final int DOWN_THREAD_NUM = 4;
		final String OUT_FILE_NAME = "down.jpg";
		InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
		RandomAccessFile[] outArr = new RandomAccessFile[DOWN_THREAD_NUM];
		try
		{
			//����һ��URL����
			URL url = new URL("http://images.china-pub.com/"
				+ "ebook35001-40000/35850/shupi.jpg");
			//�Դ�URL����򿪵�һ��������
			isArr[0] = url.openStream();
			long fileLen = getFileLength(url);
			System.out.println("������Դ�Ĵ�С" + fileLen);
			//������ļ���������һ��RandomAccessFile�����
			outArr[0] = new RandomAccessFile(OUT_FILE_NAME , "rw");
			//����һ����������Դ��ͬ��С�Ŀ��ļ�
			for (int i = 0 ; i < fileLen ; i++ )
			{
				outArr[0].write(0);
			}
			//ÿ�߳�Ӧ�����ص��ֽ���
			long numPerThred = fileLen / DOWN_THREAD_NUM;
			//����������Դ������ʣ�µ�����
			long left = fileLen % DOWN_THREAD_NUM;
			for (int i = 0 ; i < DOWN_THREAD_NUM; i++)
			{
				//Ϊÿ���̴߳�һ����������һ��RandomAccessFile����
				//��ÿ���̷ֱ߳���������Դ�Ĳ�ͬ���֡�
				if (i != 0)
				{
					//��URL�򿪶��������
					isArr[i] = url.openStream();
					//��ָ������ļ��������RandomAccessFile����
					outArr[i] = new RandomAccessFile(OUT_FILE_NAME , "rw");
				}
				//�ֱ���������߳�������������Դ
				if (i == DOWN_THREAD_NUM - 1 )
				{
					//���һ���߳�����ָ��numPerThred+left���ֽ�
					new DownThread(i * numPerThred , (i + 1) * numPerThred + left
						, isArr[i] , outArr[i]).start();
				}
				else
				{
					//ÿ���̸߳�������һ����numPerThred���ֽ�
					new DownThread(i * numPerThred , (i + 1) * numPerThred
						, isArr[i] , outArr[i]).start();
				}
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//�����ȡָ��������Դ�ĳ��ȵķ���
	public static long getFileLength(URL url) throws Exception
	{
		long length = 0;
		//�򿪸�URL��Ӧ��URLConnection��
		URLConnection con = url.openConnection();
		//��ȡ����URL��Դ�ĳ���
		long size = con.getContentLength();
		length = size;
		return length;
	}
}
