

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestIntegral
{
	public static void main(String[] args) 
	{
		//�����������ȷ�ģ�ϵͳ���Զ���56����byte���ʹ���
		byte a = 56;
		/*
		��������Ǵ�ģ�ϵͳ�����9223372036854775807����long���ʹ���
		���Գ���int�ı�����Χ���Ӷ��������
		*/
		//long bigValue = 9999999999999;
		//�����������ȷ�ģ��ھ޴������������ʹ��L��׺��ǿ��ʹ��long����
		long bigValue2 = 9223372036854775807L;
	
		//��0��ͷ������������8���Ƶ�����
		int octalValue = 013;
		System.out.println(octalValue);
		//��0x��0X��ͷ������������16���Ƶ�����
		int hexValue1 = 0x13;
		int hexValue2 = 0XaF;

		System.out.println(hexValue1);
		System.out.println(hexValue2);


	}
}
