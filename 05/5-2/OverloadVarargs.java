

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class OverloadVarargs
{
	public void test(String msg)
	{
		System.out.println("ֻ��һ���ַ���������test���� ");		
	}
	//��Ϊǰ���Ѿ�����һ��test������test��������һ���ַ���������
	//�˴��ĳ��ȿɱ��β��ﲻ����һ���ַ�����������ʽ
	public void test(String... books)
	{
		System.out.println("*******�βγ��ȿɱ��test����****** ");		
	}

	public static void main(String[] args)
	{
		OverloadVarargs olv = new OverloadVarargs();
		//�������ε��ý�ִ�еڶ���test����
		olv.test();
		olv.test("aa" , "bb");
		//���潫ִ�е�һ��test����
		olv.test("aa");
		//���潫ִ�еڶ���test����
		olv.test(new String[]{"aa"});

	}
}
