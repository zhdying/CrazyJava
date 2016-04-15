import java.util.concurrent.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

//ʵ��Runnable�ӿ�������һ���򵥵�
class TestThread implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 100 ; i++ )
		{
			System.out.println(Thread.currentThread().getName()
				+ "��iֵΪ:" + i);
		}
	}
}

public class ThreadPoolTest
{
	public static void main(String[] args) 
	{
		//����һ�����й̶��߳�����6�����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ2���߳�
		pool.submit(new TestThread());
		pool.submit(new TestThread());
		//�ر��̳߳�
		pool.shutdown();
	}
}
