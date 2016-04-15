

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Name
{
	private String firstName;
	private String lastName;

	public Name(){}

	public Name(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		 return this.firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		 return this.lastName;
	}

}
public class Person
{
	private final Name name;

	public Person(Name name)
	{
		//this.name = name;
		this.name = new Name(name.getFirstName(), name.getLastName());
	}
	public Name getName()
	{
		//return name;
		return new Name(name.getFirstName(), name.getLastName());
	}
	public static void main(String[] args)
	{
		Name n = new Name("���", "��");
		Person p = new Person(n);
		//���û�б�����Person�����Name���Ե�firstName����ֵΪ"���"
		System.out.println(p.getName().getFirstName());
		//�ı�Person����Name���Ե�firstName����ֵ
		n.setFirstName("�˽�");
		//���û�б�����Person�����Name���Ե�firstName����ֵΪ"�˽�"
		System.out.println(p.getName().getFirstName());
	}
}