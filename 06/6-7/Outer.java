

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void acessOuterProp()
		{
			//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
			System.out.println("�ⲿ���outProp����ֵ:" + outProp);
		}
	}
	public void accessInnerProp()
	{
		//�ⲿ�಻��ֱ�ӷ����ڲ�������,���������ֱ������
		//System.out.println("�ڲ����inProp����ֵ:" + inProp);
		//��������ڲ����Ա��������ʽ�����ڲ������
		System.out.println("�ڲ����inProp����ֵ:" + new Inner().inProp);

	}
	public static void main(String[] args)
	{
		//ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();
	}
}
