

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestAssignOperator
{
	public static void main(String[] args) 
	{
		//Ϊ����str��ֵΪJava
		String str = "Java";
		//Ϊ����pi��ֵΪ3.14
		double pi = 3.14;
		//Ϊ����visited��ֵΪtrue
		boolean visited = true;
		//������str��ֵ����str2
		String str2 = str;
		int a;
		int b;
		int c;
		//ͨ��Ϊa, b , c��ֵ���ĸ�������ֵ����7
		a = b = c = 7;
		//����ĸ�������ֵ��
		System.out.println(a + "\n" + b + "\n" + c);

		double d1 = 12.34;
		//�����ʽ��ֵ����d2
		double d2 = d1 + 5;
		//���d2��ֵ
		System.out.println(d2);

	}
}
