

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestFinalLocalVariable
{
	public void test(final int a)
	{
		//���ܶ�final���ε��βθ�ֵ���������Ƿ�
		//a = 5;
	}
	public static void main(String[] args) 
	{
		//����final�ֲ�����ʱָ��Ĭ��ֵ����str�����޷����¸�ֵ
		final String str = "hello";
		//���渳ֵ���Ƿ�
		//str = "Java";
		//����final�ֲ�����ʱû��ָ��Ĭ��ֵ����d�����ɱ���ֵһ��
		final double d;
		//��һ�θ���ʼֵ���ɹ�
		d = 5.6;
		//��final�����ظ���ֵ���������Ƿ�
		//d = 3.4;
	}
}
