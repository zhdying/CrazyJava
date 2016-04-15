
import java.util.regex.*; 

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class StartEnd 
{ 
	public static void main(String[] args)
	{
		String regStr = "Java is very easy!";
		System.out.println("Ŀ���ַ����ǣ�" + regStr);
		Matcher m = Pattern.compile("\\w+") 
			.matcher(regStr); 
		while(m.find())
		{
			System.out.println(m.group() + "�Ӵ�����ʼλ�ã�" + m.start()
				+ "�������λ�ã�" + m.end()); 
		}
	} 
}
