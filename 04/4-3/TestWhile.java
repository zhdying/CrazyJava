

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestWhile
{
	public static void main(String[] args) 
	{
		//ѭ���ĳ�ʼ������
		int count = 0;
		//��countС��10ʱ��ִ��ѭ����
		while (count < 10) 
		{
			System.out.println(count);
			//ѭ���������
			count++;
		}
		System.out.println("ѭ������!");

		/*
		//������һ����ѭ��
		int count = 0;
		while (count < 10)
		{
			System.out.println("��ִͣ�е���ѭ�� " + count);
			count--;
		}
		System.out.println("��Զ�޷�������ѭ����");
		*/

		/*
		int count = 0;
		//while�����һ���ֺţ�����ѭ������һ���ֺţ�����䣩
		while (count < 10);
		//����Ĵ������whileѭ���Ѿ�û���κι�ϵ
		{
			System.out.println("------" + count);
			count++;
		}
		*/

	}
}
