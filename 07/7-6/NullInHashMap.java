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
public class NullInHashMap
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		//��ͼ��2��keyΪnull��key-value�Է���HashMap��
		hm.put(null , null);
		hm.put(null , null);
		//��һ��valueΪnull��key-value�Է���HashMap��
		hm.put("a" , null);
		//���Map����
		System.out.println(hm);
	}
}
