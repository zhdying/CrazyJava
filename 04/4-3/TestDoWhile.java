

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestDoWhile
{
	public static void main(String[] args) 
	{

		//�������count
		int count = 1;
		//ִ��do whileѭ��
		do
		{
			System.out.println(count);
			// ѭ���������
			count++;
		}
		//ѭ����������while�ؼ���
		while (count < 10);
		System.out.println("ѭ������!");

		//�������count2
		int count2 = 20;
		//ִ��do whileѭ��
		do
			//���д����ѭ����͵������ֺϲ�����һ�д���
			System.out.println(count2++);
		while (count2 < 10);
		System.out.println("ѭ������!");
	}
}
