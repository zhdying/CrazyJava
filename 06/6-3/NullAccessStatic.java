

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class NullAccessStatic
{
	private static void test()
	{
		System.out.println("��̬����");
	}
	public static void main(String[] args) 
	{
		//����һ��NullAccessStatic��������ֵΪnull
		NullAccessStatic nas = null;
		//null�������������ľ�̬����
		nas.test();
	}
}
