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
public class TestSynchronized
{
	public static void main(String[] args)
	{
		//������򴴽����ĸ�ͬ���ļ��϶���
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList()); 
		Set s = Collections.synchronizedSet(new HashSet()); 
		Map m = Collections.synchronizedMap(new HashMap()); 
	}
}
