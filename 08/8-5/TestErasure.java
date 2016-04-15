

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

class Apple<T extends Number>
{
	T size;

	public Apple()
	{
	}

	public Apple(T size)
	{
		this.size = size;
	}

	public void setA(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		 return this.size;
	}
}

public class TestErasure
{
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<Integer>(6);
		//a��getSize��������Integer����
		Integer as = a.getSize();
		//��a���󸳸�Apple�������ᶪʧ���������������Ϣ
		Apple b = a;
		//bֻ֪��size��������Number
		Number size1 = b.getSize();
		//�����������������
		//Integer size2 = b.getSize();
	}
}