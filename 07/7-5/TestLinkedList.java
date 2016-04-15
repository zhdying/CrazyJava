
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
public class TestLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList books = new LinkedList();
		//���ַ���Ԫ�ؼ�����е�β��
		books.offer("Struts2Ȩ��ָ��");
		//��һ���ַ���Ԫ����ջ
		books.push("������J2EE��ҵӦ��ʵս");
		//���ַ���Ԫ����ӵ����е�ͷ��
		books.offerFirst("ROR���ݿ������ʵ��");
		for (int i = 0; i < books.size() ; i++ )
		{
			System.out.println(books.get(i));
		}
		//���ʡ�����ɾ�����еĵ�һ��Ԫ��
		System.out.println(books.peekFirst());
		//���ʡ�����ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//���ó�ջ�ķ�ʽ����һ��Ԫ��pop������
		System.out.println(books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println(books);
		//���ʡ���ɾ�����е����һ��Ԫ��
		System.out.println(books.pollLast());
		//�������������������ֻʣ���м�һ��Ԫ�أ�������J2EE��ҵӦ��ʵս
		System.out.println(books);

	}
}
