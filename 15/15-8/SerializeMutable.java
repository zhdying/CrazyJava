
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
public class SerializeMutable
{
	public static void main(String[] args) 
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try
		{
			//����һ��ObjectOutputStream������
			oos = new ObjectOutputStream(
				new FileOutputStream("mutable.txt"));
			Person per = new Person("�����", 500);
			//ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			//�ı�per�����name����
			per.setName("��˽�");
			//ϵͳֻ��������л���ţ����Ըı���name���ᱻ���л�
			oos.writeObject(per);
			//����һ��ObjectInputStream������
			ois = new ObjectInputStream(
				new FileInputStream("mutable.txt"));
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			//�������true���������л���p1����p2
			System.out.println(p1 == p2);
			//������Ȼ�������������ա������ı�������û�б����л�
			System.out.println(p2.getName());
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
