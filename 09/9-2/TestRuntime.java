

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestRuntime
{
	public static void main(String[] args) 
	{
		Runtime rt = Runtime.getRuntime();
		System.out.println("������������" + rt.availableProcessors());
		System.out.println("�����ڴ�����" + rt.freeMemory());
		System.out.println("���ڴ�����" + rt.totalMemory());
		System.out.println("��������ڴ�����" + rt.maxMemory());
	}
}
