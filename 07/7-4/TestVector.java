
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestVector
{
	public static void main(String[] args) 
	{
		Stack v = new Stack();
		//���ν�����Ԫ��push��"ջ"
		v.push("Struts2Ȩ��ָ��");
		v.push("������J2EE��ҵӦ��ʵս");
		v.push("ROR���ݿ������ʵ��");
		//�����[Struts2Ȩ��ָ��, ������J2EE��ҵӦ��ʵս, ROR���ݿ������ʵ��]
		System.out.println(v);
		//���ʵ�һ��Ԫ�أ�����������pop��"ջ"�������ROR���ݿ������ʵ��
		System.out.println(v.peek());
		//��Ȼ�����[Struts2Ȩ��ָ��, ������J2EE��ҵӦ��ʵս, ROR���ݿ������ʵ��]
		System.out.println(v);
		//pop����һ��Ԫ�أ������ROR���ݿ������ʵ��
		System.out.println(v.pop());
		//��Ȼ�����[Struts2Ȩ��ָ��, ������J2EE��ҵӦ��ʵս]
		System.out.println(v);
	}
}
