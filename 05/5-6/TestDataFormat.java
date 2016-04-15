
import java.util.*;
import java.text.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestDataFormat
{
	public static void main(String[] args) throws Exception
	{
		/*
			DateFormat�Ĺ�������protected�� �����ṩ��һЩ��̬��������ȡDateFormatʵ����
			df = new DateFormat();
			getDateInstance �� ��ʽ������ַ���ֻ�����ڡ�
			getTimeInstance �� ��ʽ�����ַ���ֻ��ʱ��
			getDateTimeInstance �� ��ʽ���ĵ��ַ��������ڡ�ʱ��

		*/
		Date d = new Date();
		System.out.println(d);
		//Ϊ�˳�������ѺõĽ��棬Ҫ���Dateת����һ������Locale���ַ�����

		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.getDefault()); 
		System.out.println(df.format(d));

		String dateStr = "2007��aa��20�� ���ڶ� ����11ʱ54��15�� CST";
		System.out.println(df.parse(dateStr));

	}
}
