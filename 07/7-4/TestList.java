
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class TestList
{
	public static void main(String[] args) 
	{
		List books = new ArrayList();
		//��books�������������Ԫ��
		books.add(new String("������J2EE��ҵӦ��ʵս"));
		books.add(new String("Struts2Ȩ��ָ��"));
		books.add(new String("����J2EE��Ajax����"));
		System.out.println(books);
		//�����ַ�����������ڵڶ���λ��
		books.add(1 , new String("ROR���ݿ������ʵ��"));
		for (int i = 0 ; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
		//ɾ��������Ԫ��
		books.remove(2);
		System.out.println(books);
		//�ж�ָ��Ԫ����List������λ�ã����1������λ�ڵڶ�λ
		System.out.println(books.indexOf(new String("ROR���ݿ������ʵ��")));
		//���ڶ���Ԫ���滻���µ��ַ�������
		books.set(1, new String("Struts2Ȩ��ָ��"));
		System.out.println(books);
		//��books���ϵĵڶ���Ԫ�أ���������������Ԫ�أ�����������ȡ���Ӽ���
		System.out.println(books.subList(1 , 2));

	}
}
