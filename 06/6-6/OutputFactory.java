
import lee.Output;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class OutputFactory
{
	public Output getOutput()
	{
		//�������д������ڿ���ϵͳ����ʹ��Output���ĸ�ʵ���ࡣ
		//return new Printer();
		return new BetterPrinter();
	}
	public static void main(String[] args) 
	{
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("������J2EE��ҵӦ��ʵս");
		c.keyIn("Struts2Ȩ��ָ��");
		c.print();
	}
}
