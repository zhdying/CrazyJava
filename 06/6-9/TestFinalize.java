

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestFinalize
{
	private static TestFinalize tf = null;
	public void info()
	{
		System.out.println("������Դ�����finalize����");
	}
	public static void main(String[] args) throws Exception
	{
		//����TestFinalize������������ȥ��״̬
		new TestFinalize();
		//֪ͨϵͳ������Դ����
		System.gc();
		System.runFinalization();
		//Thread.sleep(2000);
		tf.info();
	}
	public void finalize()
	{
		//��tf���õ���ͼ���յ�ȥ����󣬼�ȥ��������±�ɼ���
		tf = this;
	}
}
