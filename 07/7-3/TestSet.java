
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

public class TestSet
{
	public static void main(String[] args) 
	{
		Set books = new HashSet();
		//���һ���ַ�������
		books.add(new String("Struts2Ȩ��ָ��"));
		//�ٴ����һ���ַ�������
		//��Ϊ�����ַ�������ͨ��equals�����Ƚ���ȣ��������ʧ�ܣ�����false
		boolean result = books.add(new String("Struts2Ȩ��ָ��"));
		System.out.println(result);
		//���������������ֻ��һ��Ԫ��
		System.out.println(books);	
	}
}