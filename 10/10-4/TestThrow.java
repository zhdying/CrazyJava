

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestThrow
{
	public static void main(String[] args) 
	{
		try
		{
			//���ô�throws�����ķ�����������ʽ������쳣
			//���򣬱�����main�������ٴ������׳�
			throwChecked(-3);			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		//�����׳�Runtime�쳣�ķ����ȿ�����ʽ������쳣��
		//Ҳ�ɲ������쳣
		throwRuntime(3);
	}
	public static void throwChecked(int a)throws Exception
	{
		if (a > 0)
		{
			//�����׳�Exception�쳣
			//�ô�����봦��try������ڴ�throws�����ķ�����
			throw new Exception("a��ֵ����0��������Ҫ��");
		}
	}
	public static void throwRuntime(int a)
	{
		if (a > 0)
		{
			//�����׳�RuntimeException�쳣���ȿ�����ʽ������쳣
			//Ҳ����ȫ�������쳣���Ѹ��쳣�����÷��������ߴ���
			throw new RuntimeException("a��ֵ����0��������Ҫ��");
		}
	}
}
