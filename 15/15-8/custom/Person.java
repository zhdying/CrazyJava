import java.io.*;
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
	implements java.io.Serializable
{
	private String name;
	private int age;

	public Person(String name , int age)
	{
		System.out.println("�в����Ĺ�����");
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		 return this.age;
	}

	private void writeObject(java.io.ObjectOutputStream out)
		 throws IOException
	{
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}
	private void readObject(java.io.ObjectInputStream in)
		 throws IOException, ClassNotFoundException
	{
		this.name = ((StringBuffer)in.readObject()).reverse().toString();
		this.age = in.readInt();
	}
}