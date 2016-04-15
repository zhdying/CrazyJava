
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

//Z�࣬��д��equals���������Ƿ���false��
//��д��compareTo(Object obj)���������Ƿ���������
class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		return false;
	}
	public int compareTo(Object obj)
	{
		return 1;
	}
}
public class TestTreeSet
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		System.out.println(set.add(z1));
		//�������set���ϣ���������2��Ԫ��
		System.out.println(set);
		//�޸�set���ϵĵ�һ��Ԫ�ص�age����
		((Z)(set.first())).age = 9;
		//���set���ϵ����һ��Ԫ�ص�age���ԣ�������Ҳ�����9
		System.out.println(((Z)(set.last())).age);
	}
}
