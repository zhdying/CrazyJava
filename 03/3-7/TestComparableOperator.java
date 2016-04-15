

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestComparableOperator
{
	public static void main(String[] args) 
	{
		//���true
		System.out.println("5�Ƿ����4.0��" + (5 > 4.0));
		//���true
		System.out.println("5��5.0�Ƿ���ȣ�" + (5 == 5.0));
		//���true
		System.out.println("97��'a'�Ƿ���ȣ�" + (97 == 'a'));
		//���false
		System.out.println("true��false�Ƿ���ȣ�" + (true == false));
		//����2��TestComparableOperator���󣬷ֱ𸳸�t1��t2��������
		TestComparableOperator t1 = new TestComparableOperator();
		TestComparableOperator t2 = new TestComparableOperator();
		//t1��t2��ͬһ���������ʵ�������ã����Կ��ԱȽϣ���t1��t2���ò�ͬ�Ķ���
		//���Է���false
		System.out.println("t1�Ƿ����t2��" + (t1 == t2));
		//ֱ�ӽ�t1��ֵ����t3������t3ָ��t1ָ��Ķ���
		TestComparableOperator t3 = t1;
		//t1��t3ָ��ͬһ���������Է���true��
		System.out.println("t1�Ƿ����t3��" + (t1 == t3));



		Integer a = new Integer(6);
		//���true
		System.out.println("6�İ�װ��ʵ���Ƿ����5.0" + (a > 5.0));
		
		//���false
		System.out.println("�Ƚ�2����װ���ʵ���Ƿ���ȣ�" 
			+ (new Integer(2) == new Integer(2)));
		//ͨ���Զ�װ�䣬����ѻ�������ֵ��ֵ����װ���ʵ��
		Integer ina = 2;
		Integer inb = 2;
		//���true
		System.out.println("����2�Զ�װ����Ƿ���ȣ�" + (ina == inb));
		Integer biga = 128;
		Integer bigb = 128;
		//���false
		System.out.println("����128�Զ�װ����Ƿ���ȣ�" + (biga == bigb));


		//ͨ��new���ù���������������Stringʵ��
		String aStr = new String("Hello");
		String bStr = new String("Hello");
		//���false
		System.out.println("ͨ������������ͬ���ַ���new������Stringʵ���Ƿ���ȣ�" 
			+ (aStr == bStr));
		//ͨ��ֱ������ֵ����������Stringʵ��
		String cStr = "Hello";
		String dStr = "Hello";
		//���true
		System.out.println("ֱ�Ӱ�����������ͬ���ַ�������String�����Ƿ���ȣ�" 
			+ (cStr == dStr));

	}
}
