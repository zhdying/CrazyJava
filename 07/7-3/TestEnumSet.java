
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
public class TestEnumSet
{
	public static void main(String[] args) 
	{
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		//����Collection����������Ԫ��������EnumSet����
		EnumSet enumSet = EnumSet.copyOf(c);
		//���[SPRING,FALL]
		System.out.println(enumSet);
		c.add("Struts2Ȩ��ָ��");
		c.add("������J2EE��ҵӦ��ʵս");
		//�����������쳣����Ϊc�������Ԫ�ز���ȫ����Ϊö��ֵ
		enumSet = EnumSet.copyOf(c); 
	}
} 