

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestReferenceTransfer
{
	public static void swap(DataWrap dw)
	{
		//�������д���ʵ��dw��a��b����ֵ������
		//����һ����ʱ����������dw�����a���Ե�ֵ
		int tmp = dw.a;
		//��dw�����b����ֵ����a����
		dw.a = dw.b;
		//����ʱ����tmp��ֵ����dw�����a����
		dw.b = tmp;
		System.out.println("swap�����a���Ե�ֵ��" + dw.a + "��b��ֵ��" + dw.b);
		//��dwֱ�Ӹ�Ϊnull����������ָ���κ���Ч��ַ��
		dw = null;
	}
	public static void main(String[] args) 
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a���Ե�ֵ��" + dw.a + "��b���Ե�ֵ��" + dw.b);

	}
}