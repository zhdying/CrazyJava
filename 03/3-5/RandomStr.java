

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class RandomStr
{
	public static void main(String[] args) 
	{
		//����һ�����ַ���
		String result = "";
		//����6��ѭ��
		for(int i = 0 ; i < 6 ; i ++)
		{
			//����һ��97��122��int�͵�����
			int intVal = (int)(Math.random() * 26 + 97);
			//��intValueǿ��ת��Ϊchar�����ӵ�result����
			result = result + (char)intVal;
		}
		//�������ַ���
		System.out.println(result);
 	}
}
