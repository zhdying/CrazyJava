
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
public class ListErr
{
	public static void main(String[] args) 
	{
		//����һ��ֻ�뱣���ַ�����List����
		List strList = new ArrayList();
		strList.add("Struts2Ȩ��ָ��");
		strList.add("����J2EE��Ajax����");
		strList.add("������J2EE��ҵӦ��ʵս");
		//����С�ġ���һ��Integer���󡱶���"�˼���
		strList.add(5);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//��ΪList��ȡ����ȫ����Object�����Ա���ǿ������ת��
			//���һ��Ԫ�ؽ�����ClassCastException�쳣
			String str = (String)strList.get(i);
		}
	}
}