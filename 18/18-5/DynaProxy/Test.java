

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Test
{
	public static void main(String[] args) 
		throws Exception
	{
		//����һ��ԭʼ��GunDog������Ϊtarget
		Dog target = new GunDog();
		//��ָ����target��������̬����
		Dog dog = (Dog)MyProxyFactory.getProxy(target);
		dog.info();
		dog.run();
	}
}
