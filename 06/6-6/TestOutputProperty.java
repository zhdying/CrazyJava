
package yeeku;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestOutputProperty
{
	public static void main(String[] args) 
	{
		//������һ�����е�Output�ӿڵ�MAX_CACHE_LINE����
		System.out.println(lee.Output.MAX_CACHE_LINE);
		//������佫����"Ϊfinal������ֵ"�ı����쳣��
		lee.Output.MAX_CACHE_LINE = 20;
	}
}
