

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("�������ͨ����");
	}
	public void test()
	{
		System.out.println("����ı����ǵķ���");
	}
}
public class SubClass extends BaseClass
{
	//���¶���һ��bookʵ�����Ը��Ǹ����bookʵ������
	public String book = "������J2EE��ҵӦ��ʵս";
	public void test()
	{
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args)
	{
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		BaseClass bc = new BaseClass();
		//��� 6
		System.out.println(bc.book);
		//�������ε��ý�ִ��BaseClass�ķ���
		bc.base();
		bc.test();

		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		SubClass sc = new SubClass();
		//���"������J2EE��ҵӦ��ʵս"
		System.out.println(sc.book);
		//������ý�ִ�дӸ���̳е���base����
		sc.base();
		//������ý�ִ�дӵ�ǰ���test����
		sc.test();
		//������ý�ִ�дӵ�ǰ���sub����
		sc.sub();

		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClass ploymophicBc = new SubClass();
		//��� 6 ���� �������ʵ��Ǹ�������
		System.out.println(ploymophicBc.book);
		//������ý�ִ�дӸ���̳е���base����
		ploymophicBc.base();
		//������ý�ִ�дӵ�ǰ���test����
		ploymophicBc.test();
		//��ΪploymophicBc�ı���������BaseClass��BaseClass��û���ṩsub����
		//��������������ʱ����ִ���
		//ploymophicBc.sub();
	}
}