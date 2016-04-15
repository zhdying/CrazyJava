
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

//R�࣬��д��equals���������count������ȷ���true
//��д��compareTo(Object obj)���������count������ȷ���0;
class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R(count����:" + count + ")";
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null 
			&& obj.getClass() == R.class)
		{
			R r = (R)obj;
			if (r.count == this.count)
			{
				return true;
			}
		}
		return false;
	}
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		if (this.count > r.count)
		{
			return 1;
		}
		else if (this.count == r.count)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
public class TestTreeMap
{
	public static void main(String[] args) 
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(3) , "������J2EE��ҵӦ��ʵս");
		tm.put(new R(-5) , "Struts2Ȩ��ָ��");
		tm.put(new R(9) , "ROR���ݿ������ʵ��");
		System.out.println(tm);
		//���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
		//���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastKey());
		//���ظ�TreeMap�ı�new R(2)�����Сkeyֵ��
		System.out.println(tm.higherKey(new R(2)));
		//���ظ�TreeMap�ı�new R(2)С������key��value�ԡ�
		System.out.println(tm.lowerEntry(new R(2)));
		//���ظ�TreeMap����TreeMap
		System.out.println(tm.subMap(new R(-1) , new R(4)));

	}
}
