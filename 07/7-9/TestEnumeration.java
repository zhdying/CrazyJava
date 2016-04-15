
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
public class TestEnumeration
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Struts2Ȩ��ָ��");
		v.add("������J2EE��ҵӦ��ʵս");
		Hashtable scores = new Hashtable();
		scores.put("����" , 78);
		scores.put("��ѧ" , 88);
		Enumeration em = v.elements();
		while (em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		Enumeration keyEm = scores.keys();
		while (keyEm.hasMoreElements())
		{
			Object key = keyEm.nextElement();
			System.out.print(key + "--->");
			System.out.print(scores.get(key) + "\n");
		}
	}
}
