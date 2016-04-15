

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class JoinThread extends Thread
{
	//�ṩһ���в����Ĺ��������������ø��̵߳�����
	public JoinThread(String name)
	{
		super(name);
	}
	//��дrun�����������߳�ִ����
	public void run()
	{
		for (int i = 0; i < 100 ; i++ )
		{
			System.out.println(getName() + "  " + i);
		}
	}
    public static void main(String[] args) throws Exception
    {
		//�������߳�
		new JoinThread("���߳�").start();
		for (int i = 0; i < 100 ; i++ )
		{
			if (i == 20)
			{
				JoinThread jt = new JoinThread("��Join���߳�");
				jt.start();
				//main�̵߳�����jt�̵߳�join������main�߳�
				//�����jtִ�н����Ż�����ִ��
				jt.join(); 
			}
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
    }
}
