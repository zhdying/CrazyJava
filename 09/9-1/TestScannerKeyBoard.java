
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
public class TestScannerKeyBoard
{
	public static void main(String[] args)
	{
		//System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		//sc.useDelimiter("\n"); 
		//�ж��Ƿ�����һ��������
		while(sc.hasNext())
		{
			//���������
			System.out.println("��������������ǣ�" + sc.next());
		}
	}
}
