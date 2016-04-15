

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Person
{
	private String name;
	private int age;

	public Person()
	{
	}

	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		//ִ�к�����У�飬Ҫ���û���������2��6λ֮��
		if (name.length() > 6 || name.length() < 2)
		{
			System.out.println("�����õ�����������Ҫ��");
			return;
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		 return this.name;
	}

	public void setAge(int age)
	{
		//ִ�к�����У�飬Ҫ���û����������0��100֮��
		if (age > 100 || age < 0)
		{
			System.out.println("�����õ����䲻�Ϸ�");
			return;
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		 return this.age;
	}
}