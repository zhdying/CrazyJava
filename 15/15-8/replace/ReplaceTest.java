
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
public class ReplaceTest
{
	public static void main(String[] args) 
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try
		{
			//����һ��ObjectOutputStream������
			oos = new ObjectOutputStream(
				new FileOutputStream("replace.txt"));
			Person per = new Person("�����", 500);
			//ϵͳ�Ὣper����ת���ֽ����в����
			oos.writeObject(per);
			//����һ��ObjectInputStream������
			ois = new ObjectInputStream(
				new FileInputStream("replace.txt"));
			ArrayList list = (ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if (ois != null)
					ois.close();
				if (oos != null)
					oos.close();
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
