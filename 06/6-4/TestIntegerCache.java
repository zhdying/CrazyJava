

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestIntegerCache
{
	public static void main(String[] args) 
	{
		//�����µ�Integer����
		Integer in1 = new Integer(6);
		//�����µ�Integer���󣬲�����ö���
		Integer in2 = Integer.valueOf(6);
		//ֱ�Ӵӻ�����ȡ��Ineger����
		Integer in3 = Integer.valueOf(6);
		//���false
		System.out.println(in1 == in2);
		//���true
		System.out.println(in2 == in3);
	}
}
