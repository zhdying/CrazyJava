

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
class MyTest
{
	static
	{
		System.out.println("��̬��ʼ����...");
	}
	//ʹ��һ���ַ���ֱ����Ϊstatic final���Ը�ֵ
	static final String comileConstant = 
		"Struts2Ȩ��ָ��";
//	//����ϵͳ��ǰʱ��Ϊstatic final���Ը�ֵ
//	static final String comileConstant = 
//		System.currentTimeMillis() + "";

}
public class TestCompileConstant
{
	public static void main(String[] args) 
	{
		//���ʡ����MyTest�е�comileConstant����
		System.out.println(MyTest.comileConstant);
	}
}
