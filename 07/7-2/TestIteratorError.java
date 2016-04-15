
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
public class TestIteratorError
{
	public static void main(String[] args) 
	{
		//����һ������
		Collection books = new HashSet();
		books.add("������J2EE��ҵӦ��ʵս");
		books.add("Struts2Ȩ��ָ��");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("Struts2Ȩ��ָ��"))
			{
				//ʹ��Iterator���������У������޸ļ���Ԫ��,������������쳣
				books.remove(book);
			}
		}
	}
}
