

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestLogicOperator
{
	public static void main(String[] args) 
	{
		//ֱ�Ӷ�false������㣬������true
		System.out.println(!false);
		//5>3����true��'6'ת��Ϊ����54��'6'>10����true������󷵻�true
		System.out.println(5 > 3 && '6' > 10);
		//4>=5����false��'c'>'a'����true�����󷵻�true
		System.out.println(4 >= 5 || 'c' > 'a'); 
		//4>=5����false��'c'>'a'����true��������ͬ�Ĳ���������򷵻�true
		System.out.println(4 >= 5 ^ 'c' > 'a'); 

		//�������a,b����Ϊ����������ֵ
		int a = 5;
		int b = 10;
		//��a > 4��b++ > 10�������
		if (a > 4 | b++ > 10)
		{
			// ���a��ֵ��5��b��ֵ��11��
			System.out.println("a��ֵ��:" + a + "   b��ֵ��:" + b);
		}

		//�������c,d����Ϊ����������ֵ
		int c = 5;
		int d = 10;
		//c > 4 || d++ > 10�������
		if (c > 4 || d++ > 10)
		{
			// ���c��ֵ��5��d��ֵ��10��
			System.out.println("c��ֵ��:" + c + "   d��ֵ��:" + d);
		}

	}
}
