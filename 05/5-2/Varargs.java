

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Varargs
{
	//�������βθ����ɱ�ķ���
	public static void test(int a , String... books)
	{
		//books���������鴦��
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		//�����������a��ֵ
		System.out.println(a);
	}



	public static void main(String[] args) 
	{
		//����test������Ϊargs�������Դ��������ַ���
		test(5 , "Struts2Ȩ��ָ��" , "����J2EE��Ajax����");
		//����test������Ϊargs�������Դ��������ַ���
		test(23 , new String[]{"Ruby On Rails���ݿ������ʵ��" , "��������ҵӦ��ʵս"});

	}
}
