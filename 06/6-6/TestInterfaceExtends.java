

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
interface interfaceA
{
	int PROP_A = 5;
	void testA();
}
interface interfaceB
{
	int PROP_B = 6;
	void testB();
}
interface interfaceC extends interfaceA, interfaceB
{
	int PROP_C = 7;
	void testC();
}
public class TestInterfaceExtends 
{
	public static void main(String[] args)
	{
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}