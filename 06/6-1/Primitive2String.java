

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Primitive2String
{
	public static void main(String[] args) 
	{
		String intStr = "123";
		//��һ���ض��ַ���ת����int����
		int it = Integer.parseInt(intStr);
		System.out.println(it);
		String floatStr = "4.56";
		//��һ���ض��ַ���ת����float����
		float ft = Float.parseFloat(floatStr);
		System.out.println(ft);
		//��һ��float����ת����String����
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		//��һ��double����ת����String����
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		//��һ��boolean����ת����String����
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
