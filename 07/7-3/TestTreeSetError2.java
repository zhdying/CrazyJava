
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

public class TestTreeSetError2
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		//��TreeSet�������������Err����
		ts.add(new String("StrutsȨ��ָ��"));
		ts.add(new Date());
	}
}
