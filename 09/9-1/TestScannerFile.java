
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
public class TestScannerFile
{
	public static void main(String[] args) throws Exception
	{
		//��һ��File������ΪScanner�Ĺ�������������Scanner��ȡ�ļ�����
		Scanner sc = new Scanner(new File("a.txt"));
		System.out.println("a.txt�ļ��������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine())
		{
			//����ļ��е�һ��
			System.out.println(sc.nextLine());
		}
	}
}
