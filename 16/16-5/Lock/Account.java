
import java.util.concurrent.locks.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Account
{
	//����������
	private final ReentrantLock lock = new ReentrantLock();
	private String accountNo;
	private double balance;


	public Account(){}

	public Account(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		 return this.accountNo;
	}

	public double getBalance()
	{
		 return this.balance;
	}
	public void draw(double drawAmount)
	{
		lock.lock();
		try
		{
			//�˻�������ȡǮ��Ŀ
			if (balance >= drawAmount)
			{
				//�³���Ʊ
				System.out.println(Thread.currentThread().getName() + 
					"ȡǮ�ɹ����³���Ʊ:" + drawAmount);
				try
				{
					Thread.sleep(1);			
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				//�޸����
				balance -= drawAmount;
				System.out.println("\t���Ϊ: " + balance);
			}
			else
			{
				System.out.println(Thread.currentThread().getName() +
					"ȡǮʧ�ܣ����㣡");
			}			
		}
		finally
		{
			lock.unlock();
		}
	}

	public int hashCode()
	{
		return accountNo.hashCode();
	}
	public boolean equals(Object obj)
	{
		if (obj != null && obj.getClass() == Account.class)
		{
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}