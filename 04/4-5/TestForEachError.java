

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestForEachError
{
	public static void main(String[] args) 
	{
		String[] books = {"������J2EE��ҵӦ��ʵս" , 
			"Struts2Ȩ��ָ��",
			"����J2EE��Ajax����"};
		//ʹ��foreachѭ������������Ԫ�أ�����book�����Զ�����ÿ������Ԫ��
		for (String book : books)
		{
			book = "Ruby On Rails���ݿ������ʵ��";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}
}

