

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		//return this�����ص��ø÷����Ķ���
		return this;
	}
	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		//������������ͬһ������
		rt.grow()
		  .grow()
		  .grow();
		System.out.println("rt��age����ֵ��:" + rt.age);
	}
}
