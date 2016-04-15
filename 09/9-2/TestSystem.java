import java.util.*;
import java.io.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestSystem
{
	public static void main(String[] args) throws Exception
	{
		//��ȡϵͳ���еĻ�������
		Map<String,String> env = System.getenv();
		for (String name : env.keySet())
		{
			System.out.println(name + " ------> " + env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//������ϵͳ���Ա��浽props.txt�ļ���
		props.store(new FileOutputStream("props.txt") , "System Properties");
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}
