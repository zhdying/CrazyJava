

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class Apple
{
	//����info�����ѹ�ʱ
	@Deprecated
	public void info()
	{
		System.out.println("Apple��info����");
	}
}
public class DeprecatedTest
{
	public static void main(String[] args) 
	{
		//����ʹ��info����ʱ���ᱻ����������
		new Apple().info();
	}	
}