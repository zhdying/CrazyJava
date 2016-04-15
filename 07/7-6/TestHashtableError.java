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
public class TestHashtableError
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(new A(60000) , "Struts2Ȩ��ָ��");
		ht.put(new A(87563) , "������J2EE��ҵӦ��ʵս");
		Iterator it = ht.keySet().iterator();
		A first = (A)it.next();
		first.count = 87563;
		System.out.println(ht);
		ht.remove(new A(87563));
		System.out.println(ht);
		//�޷���ȡʣ�µ�value���������д��붼�����null��
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(60000)));
	}
}
