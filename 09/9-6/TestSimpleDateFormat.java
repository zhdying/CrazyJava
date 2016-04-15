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
public class TestSimpleDateFormat
{
	public static void main(String[] args) throws Exception
	{
		Date d = new Date();
		//����һ��Simpledate
		SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy���е�D��");
		//��d��ʽ�������ڣ��������Ԫ2007���е�354��
		String dateStr = sdf1.format(d);
		System.out.println(dateStr);
		//һ���ǳ�����������ַ���
		String str = "07###����##21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
		//�������ַ������������ڣ������Wed Mar 21 00:00:00 CST 2007
		System.out.println(sdf2.parse(str));
	}
}
