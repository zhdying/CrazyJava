
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
public class TestCollection
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("�����");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:" + c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c���ϵ��Ƿ����������ַ���:" + c.contains("�����"));
		c.add("������J2EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		Collection books = new HashSet();
		books.add("������J2EE��ҵӦ��ʵս");
		books.add("Struts2Ȩ��ָ��");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//ɾ��c����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�" + c);
		//books������ֻʣ��c������Ҳͬʱ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��:" + books);
	}
}
