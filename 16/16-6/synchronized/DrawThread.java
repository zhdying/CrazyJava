

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class DrawThread extends Thread
{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;

	public DrawThread(String name , Account account , 
		double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	//�ظ�100��ִ��ȡǮ����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++ )
		{
			account.draw(drawAmount);
		}
	}
}