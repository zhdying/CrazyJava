

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args) 
	{
		//��Ϊmain�����Ǿ�̬��������info�ǷǾ�̬����������������佫���ִ���
		info();
	}
}