import java.lang.reflect.*;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MyProxyFactory
{
	//Ϊָ��target���ɶ�̬�������
	public static Object getProxy(Object target)
		throws Exception
	{
		//����һ��MyInvokationHandler����
		MyInvokationHandler handler = 
			new MyInvokationHandler();
		//ΪMyInvokationHandler����target����
		handler.setTarget(target);
		//������������һ����̬����
		return Proxy.newProxyInstance(target.getClass().getClassLoader()
			, target.getClass().getInterfaces(), handler);
	}
}
