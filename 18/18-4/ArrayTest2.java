import java.lang.reflect.*;
import java.util.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class ArrayTest2
{
	public static void main(String args[])
	{
		/*����һ����ά���顣
		  ����ǰ���������ʱ���ģ���ά����Ҳ��һά���飬������Ԫ����
		  ��ά�����һά���飬��˿�����Ϊarr�ǳ���Ϊ3��һά����
		*/
		Object arr = Array.newInstance(String.class, 3, 4, 10);
		//��ȡarr������indexΪ2��Ԫ�أ�Ӧ���Ƕ�ά����
		Object arrObj = Array.get(arr, 2);
		//ʹ��ArrayΪ��ά���������Ԫ�ظ�ֵ��
		//��ά���������Ԫ����һά���飬���Դ���Array set�����ĵ�����������
		//������������һά���顣
		Array.set(arrObj , 2 , new String[]
		{
			"Struts2Ȩ��ָ��",
			"������J2EE��ҵӦ��ʵս"
		});
		//��ȡarrObj������indexΪ3��Ԫ�أ�Ӧ����һά���顣
		Object anArr  = Array.get(arrObj, 3);
		Array.set(anArr , 8  , "ROR���ݿ������ʵ��");
		//��arrǿ������ת��Ϊ��ά����
		String[][][] cast = (String[][][])arr;
		//��ȡcast��ά������ָ��Ԫ�ص�ֵ
		System.out.println(cast[2][3][8]);
		System.out.println(cast[2][2][0]);
		System.out.println(cast[2][2][1]);
	}
}