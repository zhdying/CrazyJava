
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
public class TestIdentityHashMap
{
	public static void main(String[] args) 
	{
		IdentityHashMap ihm = new IdentityHashMap();
		//�������д��뽫����IdentityHashMap���������2��key-value��
		ihm.put(new String("����") , 89);
		ihm.put(new String("����") , 78);
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}
