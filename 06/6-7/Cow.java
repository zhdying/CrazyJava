

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Cow
{
	private double weight;
	//�ⲿ����������صĹ�����
	public Cow(){}
	public Cow(double weight)
	{
		this.weight = weight;
	}
	//����һ���ڲ���
	private class CowLeg
	{
		//�ڲ������������
		private double length;
		private String color;
		//�ڲ�����������صĹ�����
		public CowLeg(){}
		public CowLeg(double length , String color)
		{
			this.length = length;
			this.color = color;
		}
		public void setLength(double length)
		{
			this.length = length;
		}
		public double getLength()
		{
			 return this.length;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public String getColor()
		{
			 return this.color;
		}
		//�ڲ��෽��
		public void info()
		{
			System.out.println("��ǰţ����ɫ�ǣ�" + color + ", �ߣ�" + length);
			//ֱ�ӷ����ⲿ���private���ԣ�weight
			System.out.println("��ţ��������ţ�أ�" + weight);
		}
	}
	public void test()
	{
		CowLeg cl = new CowLeg(1.12 , "�ڰ����");
		cl.info();
	}
	public static void main(String[] args)
	{
		Cow cow = new Cow(378.9);
		cow.test();
	}
}