

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestNestedLoop
{
	public static void main(String[] args) 
	{
		//���ѭ��
		for (int i = 0 ; i < 5 ; i++ )
		{
			//�ڲ�ѭ��
			for (int j = 0; j < 3 ; j++ )
			{
				System.out.println("i��ֵΪ:" + i + "  j��ֵΪ:" + j);
			}
		}
	}
}
