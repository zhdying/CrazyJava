

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestConstructor
{
	public String name;
	public int count;
	//�ṩ�Զ���Ĺ��������ù�����������������
	public TestConstructor(String name , int count)
	{
		//���������this���������г�ʼ���Ķ���
		//�������д��뽫�����2����������this��������name��count����
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		//ʹ���Զ���Ĺ�����������TestConstructor����
		//ϵͳ����Ըö���ִ���Զ���ĳ�ʼ��
		TestConstructor tc = new TestConstructor("Struts2Ȩ��ָ��" , 20000);
		//���TestConstructor�����name��count����
		System.out.println(tc.name);
		System.out.println(tc.count);
	}
}
