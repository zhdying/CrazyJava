

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestFinalVariable
{
	//�����Ա����ʱָ��Ĭ��ֵ���Ϸ���
	final int a = 6;
	final String str;
	final int c;
	final static double d;
	//��û��ָ��Ĭ��ֵ����û���ڳ�ʼ���顢��������ָ����ʼֵ�����涨��char�����ǲ��Ϸ��ġ�
	//final char ch;
	//��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ��ʵ������ָ����ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ������ָ����ʼֵ���Ϸ�
		str = "Hello";
		//����a����ʱ�Ѿ�ָ����Ĭ��ֵ������Ϊa���¸�ֵ�����渳ֵ���Ƿ�
		//a = 9;
	}
	//��̬��ʼ���飬�ɶ�û��ָ��Ĭ��ֵ��������ָ����ʼֵ
	static
	{
		//�ھ�̬��ʼ������Ϊ������ָ����ʼֵ���Ϸ�
		d = 5.6;
	}
	//���������ɶ�û��ָ��Ĭ��ֵ����û���ڳ�ʼ������ָ����ʼֵ��ʵ������ָ����ʼֵ
	public TestFinalVariable()
	{
		//�����ʼ�������Ѿ���strָ���˳�ʼ��ֵ���������в����ٶ�final������ֵ�����渳ֵ���Ƿ�
		//str = "java";
		c = 5;
	}
	public void changeFinal()
	{
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		//d = 1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
		//ch = 'a';
	}
	public static void main(String[] args) 
	{
		TestFinalVariable tf = new TestFinalVariable();
		System.out.println(tf.a);
		System.out.println(tf.c);
		System.out.println(tf.d);
	}
}
