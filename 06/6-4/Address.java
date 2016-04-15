

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Address
{
	private final String detail;
	private final String postCode;

	//�ڹ��������ʼ������ʵ������
	public Address()
	{
		this.detail = "";
		this.postCode = "";

	}
	public Address(String detail , String postCode)
	{
		this.detail = detail;
		this.postCode = postCode;
	}
	//��Ϊ����ʵ�������ṩgetter����
	public String getDetail()
	{
		 return this.detail;
	}

	public String getPostCode()
	{
		 return this.postCode;
	}
	//��дequals�������ж����������Ƿ���ȡ�
	public boolean equals(Object obj)
	{
		if (obj instanceof Address)
		{
			Address ad = (Address)obj;
			if (this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode()))
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return detail.hashCode() + postCode.hashCode();
	}
}