
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
public class TestPhantomReference
{
	public static void main(String[] args) throws Exception
	{
		//����һ���ַ�������
		String str = new String("Struts2Ȩ��ָ��");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ�"Struts2Ȩ��ָ��"�ַ���
		PhantomReference  pr = new PhantomReference (str , rq);
		//�ж�str���ú�"Struts2Ȩ��ָ��"�ַ���֮�������
		str = null;
		//ȡ�������������õĶ��󣬲�����ͨ�������÷��ʱ����õĶ������Դ˴����null
		System.out.println(pr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//ȡ�����ö��������Ƚ��������������pr���бȽ�
		System.out.println(rq.poll() == pr);
	}
}
