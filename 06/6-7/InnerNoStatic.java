

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class InnerNoStatic
{
	private class InnerClass
	{
		/*
		����������̬���������������±������:
		�Ǿ�̬�ڲ��಻���о�̬����
		*/
		static
		{
			System.out.println("==========");
		}
		private static int inProp;
		private static void test(){};
	}
}
