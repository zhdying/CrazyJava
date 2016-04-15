import java.lang.reflect.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

class Person
{
	private String name;
	private int age;
	public String toString()
	{
		return "Person [ name:" + name + 
			" , age:" + age + " ]";
	}
}
public class FieldTest
{
	public static void main(String[] args) 
		throws Exception
	{
		//����һ��Person����
		Person p = new Person();
		//��ȡPerson���Ӧ��Class����
		Class<Person> personClazz = Person.class;
		//��ȡPerson����Ϊname������
		//ʹ��getDeclaredField�������ɻ�ȡ���ַ��ʿ��Ʒ���field
		Field nameField = personClazz.getDeclaredField("name");
		//����ͨ��������ʸ�Fieldʱȡ������Ȩ�޼��
		nameField.setAccessible(true);
		//����set����Ϊp�����ָ��Field����ֵ
		nameField.set(p , "Yeeku.H.Lee");
		//��ȡPerson����Ϊage������
		Field ageField = personClazz.getDeclaredField("age");
		//����ͨ��������ʸ�Fieldʱȡ������Ȩ�޼��
		ageField.setAccessible(true);
		//����setInt����Ϊp�����ָ��Field����ֵ
		ageField.setInt(p , 30);
		System.out.println(p);
	}
}
