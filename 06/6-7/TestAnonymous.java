

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
interface Product
{
	public double getPrice();
	public String getName();
}
public class TestAnonymous
{
	public void test(Product p)
	{
		System.out.println("������һ��" + p.getName() + "��������" + p.getPrice());
	}
	public static void main(String[] args) 
	{
		TestAnonymous ta = new TestAnonymous();
		//����test����ʱ����Ҫ����һ��Product�������˴�����������ʵ�����ʵ��
		ta.test(new Product()
		{
			public double getPrice()
			{
				return 567.8;
			}
			public String getName()
			{
				return "AGP�Կ�";
			}
		});
	}
}
