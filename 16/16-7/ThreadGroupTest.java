

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

class TestThread extends Thread
{
	//�ṩָ���߳����Ĺ�����
	public TestThread(String name)
	{
		super(name);
	}
	//�ṩָ���߳������߳���Ĺ�����
	public TestThread(ThreadGroup group , String name)
	{
		super(group, name);
	}
	public void run()
	{
		for (int i = 0; i < 20 ; i++ )
		{
			System.out.println(getName() + " �̵߳�i����" + i);
		}
	}
}
public class ThreadGroupTest
{
	public static void main(String[] args) 
	{
		//��ȡ���߳����ڵ��߳��飬���������߳�Ĭ�ϵ��߳���
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("���߳�������֣�" 
			+ mainGroup.getName());
		System.out.println("���߳����Ƿ��Ǻ�̨�߳��飺" 
			+ mainGroup.isDaemon());

		new TestThread("���߳�����߳�").start();
		ThreadGroup tg = new ThreadGroup("���߳���");
		tg.setDaemon(true);
		System.out.println("tg�߳����Ƿ��Ǻ�̨�߳��飺" 
			+ tg.isDaemon());
		TestThread tt = new TestThread(tg , "tg����̼߳�");
		tt.start();
		new TestThread(tg , "tg����߳���").start();
	}
}
