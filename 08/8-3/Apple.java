
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
public class Apple<T extends Number>
{
	T col;
	
	public static void main(String[] args)
	{
		Apple<Integer> ai = new Apple<Integer>();
		Apple<Double> ad = new Apple<Double>();
		//������뽫��������쳣
		//��ΪString���ʹ���T�βΣ���String����Number�������͡�
		Apple<String> as = new Apple<String>();
		
	}
}
