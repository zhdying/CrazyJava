

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestInstanceInit
{
	//��ִ�г�ʼ���齫a���Ը�ֵΪ6
	{
		a = 6;
	}
	//��ִ�н�a���Ը�ֵΪ9
	int a = 9;
	public static void main(String[] args) 
	{
		//������뽫���9��
		System.out.println(new TestInstanceInit().a);
	}
}
