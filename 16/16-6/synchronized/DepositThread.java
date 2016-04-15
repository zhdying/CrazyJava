

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class DepositThread extends Thread
{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ������Ǯ��
	private double depositAmount;

	public DepositThread(String name , Account account , 
		double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	//�ظ�100��ִ�д�����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++ )
		{
			account.deposit(depositAmount);
		}		
	}
}