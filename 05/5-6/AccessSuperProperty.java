

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class BaseClass
{
	public int a = 5;
}
class SubClass extends BaseClass
{
	public int a = 7;
	public void accessOwner()
	{
		System.out.println(a);
	}
	public void accessBase()
	{
		//ͨ��super�����ʷ��������߶�Ӧ�ĸ������
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		SubClass sc = new SubClass();
		//ֱ�ӷ���SubClass�����a���Խ������7
		System.out.println(sc.a);
		//���7
		sc.accessOwner();
		//���5
		sc.accessBase();
	}
}