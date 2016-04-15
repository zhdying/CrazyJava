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
public class ReadObject
{
	public static void main(String[] args) 
	{
		ObjectInputStream ois = null;
		try
		{
			//����һ��ObjectInputStream�����
			ois = new ObjectInputStream(
				new FileInputStream("object.txt"));
			//���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person p = (Person)ois.readObject();
			System.out.println("����Ϊ��" + p.getName()
				+ "\n����Ϊ��" + p.getAge());
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
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
