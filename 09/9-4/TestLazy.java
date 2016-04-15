
import java.util.*;
import static java.util.Calendar.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestLazy
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);
		cal.set(MONTH , 8); //������Ӧ������10��1�գ���ʵ������9��31�գ����Ϸ������ڣ�
		//����������10��1��
		//System.out.println(cal.getTime());
		//����DATE�ֶ�Ϊ5
		cal.set(DATE , 5);
		System.out.println(cal.getTime());
	}
}
