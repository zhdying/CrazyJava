

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestFor2
{
	public static void main(String[] args) 
	{
		//ͬʱ������������ʼ��������ʹ��&&����϶��boolean���ʽ
		for (int b = 0, s = 0 , p = 0 ; b < 10 && s < 4 && p < 10; p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}
