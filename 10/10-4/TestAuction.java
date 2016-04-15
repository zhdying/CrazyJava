

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestAuction
{
	private double initPrice = 30.0;

	public void bid(String bidPrice)
		throws AuctionException
	{
		double d = 0.0;
		try
		{
			d = Double.parseDouble(bidPrice);
		}
		catch (Exception e)
		{
			//�˴���ɱ������п��Զ��쳣ִ�е��޸������˴��������ڿ���̨��ӡ�쳣������Ϣ��
			e.printStackTrace();
			//�ٴ��׳��Զ����쳣
			throw new AuctionException("���ļ۱�������ֵ�����ܰ��������ַ���");
		}
		if (initPrice > d)
		{
			throw new AuctionException("���ļ۱����ļ۵ͣ��������ģ�");
		}
		initPrice = d;
	}

	public static void main(String[] args) 
	{
		TestAuction ta = new TestAuction();
		try
		{
			ta.bid("df");
		}
		catch (AuctionException ae)
		{
			//main�����ٴβ�׽��bid�����е��쳣�����Ը��쳣���д���
			System.err.println(ae.getMessage());
		}
	}
}
