

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestTeachableProgrammer
{
	public static void main(String[] args) 
	{
		TeachableProgrammer tp = new TeachableProgrammer("���");
		//ֱ�ӵ���TeachableProgrammer���Programmer��̳е���work����
		tp.work();
		//�����ϵ��õ���Closure��work������ʵ�����ǻص�TeachableProgrammer��teach����
		tp.getCallbackReference().work();
	}
}
