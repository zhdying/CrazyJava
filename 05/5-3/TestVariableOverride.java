

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestVariableOverride
{
	//����һ��nameʵ������
	private String name = "���";
	//����һ��price������
	private static double price = 78.0;
	//����������������
	public static void main(String[] args) 
	{
		//������ľֲ��������ֲ��������ǳ�Ա����
		int price = 65;
		//ֱ�ӷ���price�����������price�ֲ�������ֵ��65
		System.out.println(price);
		//ʹ����������Ϊprice�������޶��������price�����Ե�ֵ��78.0
		System.out.println(TestVariableOverride.price);
		//����info����
		new TestVariableOverride().info();
	}
	public void info()
	{
		//������ľֲ��������ֲ��������ǳ�Ա����
		String name = "�����";
		//ֱ�ӷ���name�����������name�ֲ�������ֵ��"�����"
		System.out.println(name);
		//ʹ��this����Ϊname�������޶��������priceʵ�����Ե�ֵ��"���"
		System.out.println(this.name);
	}
}
