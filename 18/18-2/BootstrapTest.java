
import java.net.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BootstrapTest
{
	public static void main(String[] args) 
	{
		//��ȡ��������������ص�ȫ��URL����
		URL[] urls = sun.misc.Launcher.
			getBootstrapClassPath().getURLs();
		//���������������������ص�ȫ��URL
		for (int i = 0; i < urls.length; i++) 
		{
			System.out.println(urls[i].toExternalForm());
		}
	}
}
