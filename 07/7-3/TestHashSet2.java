
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
class R
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
	public int hashCode()
	{
		return this.count;
	}
}
public class TestHashSet2
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//��ӡTreeSet���ϣ�����Ԫ�����������е�
		System.out.println(hs);
		//ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//Ϊ��һ��Ԫ�ص�count���Ը�ֵ
		first.count = -3;
		//�ٴ����count������TreeSet���Ԫ�ش�������״̬
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs);
		//���false
		System.out.println("hs�Ƿ����countΪ-3��R����" + hs.contains(new R(-3)));
		//���false
		System.out.println("hs�Ƿ����countΪ5��R����" + hs.contains(new R(5)));

	}
}
