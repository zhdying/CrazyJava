

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class ThisInConstructor
{
	//����һ����Ϊfoo������
	public int foo;
	public ThisInConstructor()
	{
		//��Test�������ﶨ��һ��foo����
		int foo = 0;
		//ʹ��this����˹������ոմ����Ķ���
		//����Ĵ��뽫��Ѹմ��������foo��������Ϊ6��
		this.foo = 6;
	}
	public static void main(String[] args)
	{
		//����ʹ��ThisInConstructor�����Ķ����foo����
		//��������Ϊ6������������뽫���6��
		System.out.println(new ThisInConstructor().foo);
	}
}
