
import java.net.*;
import java.io.*;
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
public class ProxyTest
{
	Proxy proxy;
	URL url;
	URLConnection conn;
	//������ͨ�����������
	Scanner scan;
	PrintStream ps ;
	//�����Ǵ���������ĵ�ַ�Ͷ˿ڣ�
	//����ʵ����Ч�Ĵ���������ĵ�ַ�Ͷ˿�
	String proxyAddress = "202.128.23.32";
	int proxyPort;
	//����������ͼ�򿪵���վ��ַ
	String urlStr = "http://www.oneedu.cn";

	public void init()
	{
		try
		{
			url = new URL(urlStr);
			//����һ���������������
			proxy = new Proxy(Proxy.Type.HTTP,
				new InetSocketAddress(proxyAddress , proxyPort));
			//ʹ��ָ���Ĵ��������������
			conn = url.openConnection(proxy);
			//���ó�ʱʱ����
			conn.setConnectTimeout(5000);
			scan = new Scanner(conn.getInputStream());
			//��ʼ�������
			ps = new PrintStream("Index.htm");
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				//�ڿ���̨�����ҳ��Դ����
				System.out.println(line);
				//����ҳ��Դ���������ָ�������
				ps.println(line);
			}
		}
		catch(MalformedURLException ex)
		{
			System.out.println(urlStr + "������Ч����վ��ַ��");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		//�ر���Դ
		finally
		{
			if (ps != null)
			{
				ps.close();
			}
		}
	}

    public static void main(String[] args) 
    {
		new ProxyTest().init();
    }
}