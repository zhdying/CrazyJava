

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestForError
{
	public static void main(String[] args) 
	{
		//ѭ���ĳ�ʼ������,ѭ��������ѭ��������䶼������һ��
		for (int count = 0 ; count < 10 ; count++)
		{
			System.out.println(count);
			//�ٴ��޸���ѭ������
			count *= 0.1;
		}
		System.out.println("ѭ������!");
	}
}
