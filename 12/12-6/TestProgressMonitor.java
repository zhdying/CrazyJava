import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestProgressMonitor
{
	Timer timer;
	public void init()
	{
		final SimulatedTarget target = new SimulatedTarget(1000);
		//������һ���̵߳ķ�ʽ��ִ��һ����ʱ������
		final Thread targetThread = new Thread(target);
		targetThread.start();
		//�������ȶԻ���
		final ProgressMonitor dialog = new ProgressMonitor(null ,
			"�ȴ��������" , "����ɣ�" , 0 , target.getAmount());
		//����һ����ʱ��
		timer = new Timer(300 , new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//������ĵ�ǰ��������ý��ȶԻ������ɱ���
				dialog.setProgress(target.getCurrent());
				//����û������˽��ȶԻ���ġ�ȡ������ť
				if (dialog.isCanceled())
				{
					//ֹͣ��ʱ��
					timer.stop();
					//�ж������ִ���߳�
					targetThread.interrupt();
					//ϵͳ�˳�
					System.exit(0);
				}
			}
		});
		timer.start();
	}
	public static void main(String[] args) 
	{
		new TestProgressMonitor().init();
	}
}
