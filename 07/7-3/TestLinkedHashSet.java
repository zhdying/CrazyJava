
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


public class TestLinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("Struts2Ȩ��ָ��");
		books.add("������J2EE��ҵӦ��ʵս");
		//ɾ�� Struts2Ȩ��ָ��
		books.remove("Struts2Ȩ��ָ��");
		//������� Struts2Ȩ��ָ��
		books.add("Struts2Ȩ��ָ��");
		System.out.println(books);
	}
}