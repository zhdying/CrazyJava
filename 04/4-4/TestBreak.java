

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestBreak
{
	public static void main(String[] args) 
	{
		//һ���򵥵�forѭ��
		for (int i = 0; i < 10 ; i++ )
		{
			System.out.println("i��ֵ��" + i);
			if (i == 2)
			{
				break;
			}
		}
	}
}
