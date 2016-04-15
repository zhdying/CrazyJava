
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

class A
{
	int count;
	public A(int count)
	{
		this.count = count;
	}
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj != null && 
			obj.getClass() == A.class)
		{
			A a = (A)obj;
			if (this.count == a.count)
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}
class B
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class TestHashtable
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(new A(60000) , "Struts2Ȩ��ָ��");
		ht.put(new A(87563) , "������J2EE��ҵӦ��ʵս");
		ht.put(new A(1232) , new B());
		System.out.println(ht);
		//ֻҪ��������ͨ��equals�ȽϷ���true��Hashtable����Ϊ��������ȵ�value��
		//��ΪHashtable����һ��B���������κζ���ͨ��equals�Ƚ϶���ȣ������������true��
		System.out.println(ht.containsValue("�����ַ���"));
		//ֻҪ����A�����count������ȣ�����ͨ��equals�ȽϷ���true����hashCode���
		//Hashtable����Ϊ��������ͬ��key�������������true��
		System.out.println(ht.containsKey(new A(87563)));
		//����������ɾ�����һ��key-value��
		ht.remove(new A(1232));
		for (Object key : ht.keySet())
		{
			System.out.print(key + "---->");
			System.out.print(ht.get(key) + "\n");
		}
	}
}
