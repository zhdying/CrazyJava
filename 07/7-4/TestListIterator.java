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
public class TestListIterator
{
	public static void main(String[] args) 
	{
		String[] books = {
			"Struts2Ȩ��ָ��",
			"������J2EE��ҵӦ��ʵս"
		};
		List bookList = new ArrayList();
		for (int i = 0; i < books.length ; i++ )
		{
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------�ָ���-------");
		}
		System.out.println("==========���濪ʼ�������===========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
