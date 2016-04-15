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
public class TestLinkedHashMap
{
	public static void main(String[] args) 
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("����" , 80);
		scores.put("��ѧ" , 76);
		scores.put("Ӣ��" , 76);
		//����scores������е�key-value��
		for (Object key : scores.keySet())
		{
			System.out.print(key + "------>");
			System.out.print(scores.get(key) + "\n");
		}
	}
}
