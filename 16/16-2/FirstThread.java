

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
//ͨ���̳�Thread���������߳���
public class FirstThread extends Thread
{
	private int i ;
	//��дrun������run�����ķ���������߳�ִ����
	public void run()
	{
		for ( ; i < 100 ; i++ )
		{
			//���߳���̳�Thread��ʱ������ֱ�ӵ���getName()���������ص�ǰ�̵߳�����
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this����
			//Thread�����getName���ص�ǰ���̵߳�����
			System.out.println(getName() +  " " + i);
		}
	}
	
    public static void main(String[] args) 
    {
        for (int i = 0; i < 100;  i++)
        {
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() +  " " + i);
			if (i == 20)
			{
				//��������������һ���߳�
				new FirstThread().start();
				//�������������ڶ����߳�
				new FirstThread().start();
			}
        }
    }
}