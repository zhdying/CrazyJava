

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestSwitch
{
	public static void main(String[] args) 
	{
		//��������score����Ϊ�丳ֵΪ'C'
		char score = 'C';
		//ִ��swicth��֧���
		switch (score)
		{
			case 'A': 
				System.out.println("����.");
				//break;
			case 'B': 
				System.out.println("����.");
				//break;
			case 'C': 
				System.out.println("��");
				//break;
			case 'D': 
				System.out.println("����");
				//break;
			case 'F': 
				System.out.println("������");
				//break;
			default: 
				System.out.println("�ɼ��������");
		}
	}
}
