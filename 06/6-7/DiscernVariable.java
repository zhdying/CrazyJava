

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class DiscernVariable
{
	private String prop = "�ⲿ������";
	private class InClass
	{
		private String prop = "�ڲ�������";
		public void info()
		{
			String prop = "�ֲ�����";
			//ͨ�� �ⲿ������.this.varName �����ⲿ��ʵ������
			System.out.println("�ⲿ�������ֵ��" + DiscernVariable.this.prop);
			//ͨ�� this.varName �������ڲ���ʵ��������
			System.out.println("�ڲ��������ֵ��" + this.prop);
			//ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�����������ֵ��" + prop);
		}
	}
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args) 
	{
		new DiscernVariable().test();
	}
}
