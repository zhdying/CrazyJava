

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Ostrich extends Bird
{
	//��дBird���fly����
	public void fly()
	{
		System.out.println("��ֻ���ڵ��ϱ���...");
	}
	public void callOverridedMethod()
	{
		//�����෽����ͨ��super����ʽ���ø��౻���ǵķ�����
		super.fly();
	}

	public static void main(String[] args)
	{
		//����Ostrich����
		Ostrich os = new Ostrich();
		//ִ��Ostrich�����fly�����������"��ֻ���ڵ��ϱ���..."
		os.fly();
		os.callOverridedMethod();
	}
}
