

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestConversion
{
	public static void main(String[] args) 
	{
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		//����������ʱ������ͼ��һ����ֵ�ͱ���ת��Ϊboolean�ͣ�
		//����ʱ�����ʾ: ����ת��������
		//boolean b = (boolean)in;
		Object obj = "Hello";
		//obj�����ı�������ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//����obj����ʵ��������Ҳ��String���ͣ���������ʱҲ��ͨ��
		String objStr = (String)obj;
		System.out.println(objStr);
		//����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		//objPri�����ı�������ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//��objPri����ʵ����������Integer���ͣ����������������ʱ����ClassCastException�쳣
		String str = (String)objPri;

	}
}
