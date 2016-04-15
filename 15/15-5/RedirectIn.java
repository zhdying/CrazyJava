
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
public class RedirectIn
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("RedirectIn.java");
			//����׼�����ض���fis������
			System.setIn(fis);
			//ʹ��System.in����Scanner�������ڻ�ȡ��׼����
			Scanner sc = new Scanner(System.in);
			//��������һ�н�ֻ�ѻس���Ϊ�ָ���
			sc.useDelimiter("\n");
			//�ж��Ƿ�����һ��������
			while(sc.hasNext())
			{
				//���������
				System.out.println("��������������ǣ�" + sc.next());
			}

		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
}
