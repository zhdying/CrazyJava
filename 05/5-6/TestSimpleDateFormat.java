
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM������ķ��͵�dd�� HHʱmm��ss��"); 
		System.out.println(sdf.format(new Date()));

		String dateStr = "��������2007%12%03";
		//���洴��ת���õ�SimpleDateFormatʱ����Ҫת���ַ���ʹ��ռλ���滻������Ҫת���ľ���д
		SimpleDateFormat sdf2 = new SimpleDateFormat("��������yyyy%MM%dd");
		System.out.println(sdf2.parse(dateStr));

	}
}
