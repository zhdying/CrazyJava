

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestPrimitiveTransfer
{
	public static void swap(int a , int b)
	{
		//�������д���ʵ��a��b������ֵ������
		//����һ����ʱ����������a������ֵ
		int tmp = a;
		//��b��ֵ����a
		a = b;
		//����ʱ����tmp��ֵ����a
		b = tmp;
		System.out.println("swap�����a��ֵ��" + a + "��b��ֵ��" + b);
	}
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 9;
		swap(a , b);
		System.out.println("����������ʵ��a��ֵ��" + a + "��ʵ��b��ֵ��" + b);
	}
}
