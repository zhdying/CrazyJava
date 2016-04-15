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
public class WriteToProcess
{
	public static void main(String[] args) 
	{
		PrintStream ps = null;
		try
		{
			//����java ReadStandard����������и�������ӽ���
			Process p = Runtime.getRuntime().exec("java ReadStandard");
			//��p���̵����������PrintStream����
			//���������Ա����������������p����������������
			ps = new PrintStream(p.getOutputStream());
			//��ReadStandard����д�����ݣ���Щ���ݽ���ReadStandard��ȡ
			ps.println("��ͨ�ַ���");
			ps.println(new WriteToProcess());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (ps != null)
				ps.close();
		}
	}
}
//����һ��ReadStandard�࣬������Խ��ܱ�׼���룬
//������׼����д��out.txt�ļ���
class ReadStandard
{
	public static void main(String[] args) throws Exception
	{

		//ʹ��System.in����Scanner�������ڻ�ȡ��׼����
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(
			new FileOutputStream("out.txt"));
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		sc.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while(sc.hasNext())
		{
			//���������
			ps.println("��������������ǣ�" + sc.next());
		}
		ps.close();
	}
}
