
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
public class TestForeach
{
	public static void main(String[] args) 
	{
		//����һ������
		Collection books = new HashSet();
		books.add(new String("������J2EE��ҵӦ��ʵս"));
		books.add(new String("Struts2Ȩ��ָ��"));
		books.add(new String("����J2EE��Ajax����"));
		for (Object obj : books)
		{
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("Struts2Ȩ��ָ��"))
			{
				//������������ConcurrentModificationException�쳣
				books.remove(book);
			}
		}
		System.out.println(books);
	}
}
