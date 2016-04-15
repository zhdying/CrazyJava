
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
public class ReadFromProcess
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		try
		{
			//����javac����������и�������ӽ���
			Process p = Runtime.getRuntime().exec("javac");
			//��p���̵Ĵ���������BufferedReader��������������Ա�����������������p���������������
			br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String buff = null;
			//��ȡѭ����ʽ����ȡp���̵Ĵ������
			while((buff = br.readLine()) != null)
			{
				System.out.println(buff);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if (br != null)
					br.close();
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
