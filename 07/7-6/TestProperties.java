import java.io.*;
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
public class TestProperties
{
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		//��Properties����������
		props.setProperty("username" , "yeeku");
		props.setProperty("password" , "123456");
		//��Properties�е����Ա��浽a.ini�ļ���
		props.store(new FileOutputStream("a.ini") , "comment line");
		//�½�һ��Properties����
		Properties props2 = new Properties();
		//��Properties����������
		props2.setProperty("gender" , "male");
		//��a.ini�ļ��е�������-����ֵ׷�ӵ�props2��
		props2.load(new FileInputStream("a.ini") );
		System.out.println(props2);
	}
}
