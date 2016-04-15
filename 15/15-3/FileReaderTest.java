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
public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = null;
		try
		{
			//�����ַ�������
			fr = new FileReader("FileReaderTest.java");
			//����һ������Ϊ32�ġ���Ͳ��
			char[] cbuf = new char[32];
			//���ڱ���ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			//ʹ��ѭ�����ظ���ȡˮ������
			while ((hasRead = fr.read(cbuf)) > 0 )
			{
				//ȡ������Ͳ����ˮ�Σ��ֽڣ������ַ�����ת�����ַ������룡
				System.out.print(new String(cbuf , 0 , hasRead));
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			//ʹ��finally�����ر��ļ�������
			if (fr != null)
			{
				fr.close();
			}
		}
	}
}
