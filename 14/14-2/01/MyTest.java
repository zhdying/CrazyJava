

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MyTest
{
	//ʹ��@Testable���ע��ָ���÷����ǿɲ��Ե�
	@Testable
	public static void m1() 
	{
	}
	public static void m2() 
	{
	}   
	//ʹ��@Testable���ע��ָ���÷����ǿɲ��Ե�
	@Testable
	public static void m3() 
	{        
		throw new RuntimeException("Boom");  
	}
	public static void m4()
	{
	}       
	//ʹ��@Testable���ע��ָ���÷����ǿɲ��Ե�
	@Testable
	public static void m5()
	{
	}  
    public static void m6()
	{
	}
	//ʹ��@Testable���ע��ָ���÷����ǿɲ��Ե�
	@Testable
	public static void m7()
	{            
		throw new RuntimeException("Crash");   
	}        
	public static void m8()
	{
	}
}
