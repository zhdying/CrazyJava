
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
public class URLDecoderTest
{
	public static void main(String[] args) 
		throws Exception
	{
		//��application/x-www-form-urlencoded�ַ���
		//ת������ͨ�ַ���
		//���е��ַ���ֱ�Ӵ�ͼ17.3��ʾ���ڸ��ƹ���
		String keyWord = URLDecoder.decode(
			"%E6%9D%8E%E5%88%9A+j2ee", "UTF-8");
		System.out.println(keyWord);
		//����ͨ�ַ���ת����
		//application/x-www-form-urlencoded�ַ���
		String urlStr = URLEncoder.encode(
			"ROR���ݿ������ָ��" , "GBK");
		System.out.println(urlStr);
	}
}
