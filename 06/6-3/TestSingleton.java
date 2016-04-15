

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Singleton
{
	//ʹ��һ����������������������ʵ��
	private static Singleton instance;
	//��������ʹ��private���Σ����ظù�����
	private Singleton(){}
	//�ṩһ����̬���������ڷ���Singletonʵ��
	//�÷������Լ����Զ���Ŀ��ƣ���ֻ֤����һ��Singleton����
	public static Singleton getInstance()
	{
		//���instanceΪnull����������������Singleton����
		//���instance��Ϊnull��������Ѿ�������Singleton���󣬽�����ִ�и÷���
		if (instance == null)
		{
			//����һ��Singleton���󣬲����仺������
			instance = new Singleton();
		}
		return instance;
	}
}
public class TestSingleton
{
	public static void main(String[] args)
	{
		//����Singleton������ͨ����������ֻ��ͨ��getInstance����
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//�����true
		System.out.println(s1 == s2);
	}
}