

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestTwoDimension
{
	public static void main(String[] args) 
	{
		//����һ����ά����
		int[][] a;
		//��a����һά������г�ʼ������ʼ��a��һ������Ϊ3������
		//a���������Ԫ��������������
		a = new int[3][];
		//��a���鵱��һά���飬����a�����ÿ������Ԫ��
		for (int i = 0; i < a.length ; i++ )
		{
			System.out.println(a[i]);
		}
		//��ʼ��a����ĵ�һ��Ԫ��
		a[0] = new int[2];
		//����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		//a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
		for (int i = 0 ; i < a[0].length ; i ++ )
		{
			System.out.println(a[0][i]);
		}
		//ͬʱ��ʼ����ά�����2��ά��
		int[][] b = new int[3][4];
		//ʹ�þ�̬��ʼ�����﷨����ʼ��һ����ά����
		String[][] str1 = new String[][]{new String[3]  , new String[]{"hello"}};
		//ʹ�ü򻯵ľ�̬��ʼ���﷨����ʼ����ά����
		String[][] str2 = {new String[3]  , new String[]{"hello"}};

	}
}
