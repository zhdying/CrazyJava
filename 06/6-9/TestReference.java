
import java.lang.ref.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestReference
{
	public static void main(String[] args) throws Exception
	{
		//����һ���ַ�������
		String str = new String("Struts2Ȩ��ָ��");
		//����һ�������ã��ô����������õ�"Struts2Ȩ��ָ��"�ַ���
		WeakReference wr = new WeakReference(str);
		//�ж�str���ú�"Struts2Ȩ��ָ��"�ַ���֮�������
		str = null;
		//ȡ�������������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());
	}
}
