
import java.lang.reflect.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class YeekuArray
{
	//��Array��newInstance�������а�װ
	public static <T> T[] newInstance(Class<T> componentType, int length) 
	{
		return (T[])Array.newInstance(componentType , length);
	}

	public static void main(String[] args) 
	{
		//ʹ��YeekuArray��newInstance()����һά����
		String[] arr = YeekuArray.newInstance(String.class , 10);
		//ʹ��YeekuArray��newInstance()������ά����
		//����������£�ֻҪ��������Ԫ�ص�������int[]���ɡ�
		int[][] intArr = YeekuArray.newInstance(int[].class , 5);
		arr[5] = "ROR���ݿ������ʵ��";
		//intArr�Ƕ�ά���飬��ʼ��������ĵڶ�������Ԫ�ء�������Ԫ�ر�����һά����
		intArr[1] = new int[]{ 23, 12};
		System.out.println(arr[5]);
		System.out.println(intArr[1][1]);
	}
}
