

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Base
{
	public Base()
	{
		test();
	}
	public void test() 
	{
		System.out.println("����������д�ķ���");
	}
}
class Sub extends Base
{
	private String name;
	public void test()
	{
		System.out.println("������д����ķ�������name�ַ�������" + name.length());
	}
	public static void main(String[] args)
	{
		//��������������ָ���쳣
		Sub s = new Sub();
	}
}
