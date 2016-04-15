

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Apple
{
	private String color;
	private double weight;
	public Apple(){	}
	//�ṩ�в����Ĺ�����
	public Apple(String color , double weight)
	{
		this.color = color;
		this.weight = weight;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		 return this.color;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getWeight()
	{
		 return this.weight;
	}
	public String toString()
	{		
		//return "һ��ƻ������ɫ�ǣ�" + color + "�������ǣ�" + weight;
		return "Apple[color=" + color + ",weight=" + weight + "]";
	}
}
public class TestToString
{
	public static void main(String[] args) 
	{
		Apple a = new Apple("��ɫ" , 5.68);
		System.out.println(a);
	}
}