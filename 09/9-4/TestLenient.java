
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
public class TestLenient
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(MONTH , 13); //�����YEAR�ֶμ�1��MONTH�ֶ�Ϊ1�����£�
		System.out.println(cal.getTime());
		//�ر��ݴ���
		cal.setLenient(false);
		cal.set(MONTH , 13); //��������ʱ�쳣
		System.out.println(cal.getTime());
	}
}
