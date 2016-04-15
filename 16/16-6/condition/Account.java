
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
	//��ʾ����Lock����
	private final Lock lock = new ReentrantLock();
	//���ָ��Lock�����Ӧ����������
	private final Condition cond  = lock.newCondition(); 

	private String accountNo;
	private double balance;

	//��ʶ�˻����Ƿ��Ѿ��������
	private boolean flag = false;

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
		//����
		lock.lock();
		try
		{
			//����˻��л�û�д�������̵߳ȴ�
			if (!flag)
			{
				cond.await();
			}
			else
			{
				//ִ��ȡǮ����
				System.out.println(Thread.currentThread().getName() + 
					" ȡǮ:" +  drawAmount);
				balance -= drawAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʶ�Ƿ�ɹ�������������Ϊfalse
				flag = false;
				//���Ѹ�Lock�����Ӧ�������߳�
				cond.signalAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		//ʹ��finally����ȷ���ͷ���
		finally
		{
			lock.unlock();
		}
	}
	public void deposit(double depositAmount)
	{
		lock.lock();
		try
		{
			//����˻����Ѿ������˴����̵߳ȴ�
			if(flag)
			{
				cond.await();				
			}
			else
			{
				//ִ�д�����
				System.out.println(Thread.currentThread().getName() + 
					" ���:" +  depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʶ�Ƿ�ɹ�������������Ϊtrue
				flag = true;
				//���Ѹ�Lock�����Ӧ�������߳�
				cond.signalAll();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		//ʹ��finally����ȷ���ͷ���
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