

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ArrayInRam
{
	public static void main(String[] args) 
	{
		//���岢��ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a = {5, 7 , 20};
		//���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		int[] b = new int[4];
		//���b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
		//ѭ�����a�����Ԫ��
		for (int i = 0 ; i < a.length ; i++ )
		{
			System.out.println(a[i]);
		}
		//ѭ�����b�����Ԫ��
		for (int i = 0 ; i < b.length ; i++ )
		{
			System.out.println(b[i]);
		}
		//��Ϊa��int[]���ͣ�bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b��
		//Ҳ������b����ָ��a����ָ�������
		b = a;
		//�ٴ����b����ĳ���
		System.out.println("b����ĳ���Ϊ��" + b.length);
	}
}
