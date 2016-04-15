
import java.nio.charset.Charset;
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CharsetTest
{
	public static void main(String[] args) 
	{
		//��ȡȫ���ַ���
		SortedMap<String,Charset>  map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			//����ַ����ı����Ͷ�Ӧ��Charset����
			System.out.println(alias + "----->" 
				+ map.get(alias));
		}
	}
}
