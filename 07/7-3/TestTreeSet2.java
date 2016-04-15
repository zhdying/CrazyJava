
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
		if (obj instanceof R)
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
public class TestTreeSet2
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		//��ӡTreeSet���ϣ�����Ԫ�����������е�
		System.out.println(ts);
		//ȡ����һ��Ԫ��
		R first = (R)ts.first();
		//Ϊ��һ��Ԫ�ص�count���Ը�ֵ
		first.count = 20;
		//ȡ�����һ��Ԫ��
		R last = (R)ts.last();
		//Ϊ���һ��Ԫ�ص�count���Ը�ֵ���뵹���ڶ���Ԫ��count������ͬ
		last.count = -2;
		//�ٴ����count������TreeSet���Ԫ�ش�������״̬�������ظ�Ԫ��
		System.out.println(ts);
		//ɾ�����Ա��ı��Ԫ�أ�ɾ��ʧ��
		ts.remove(new R(-2));
		System.out.println(ts);
		//ɾ������û�иı��Ԫ�أ�ɾ���ɹ�
		ts.remove(new R(5));
		System.out.println(ts);
	}
}
