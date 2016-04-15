
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
public class TestTimeZone
{
	public static void main(String[] args) 
	{
		//ȡ��Java��֧�ֵ�����ʱ��ID
		String[] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		TimeZone my = TimeZone.getDefault();
		//��ȡϵͳĬ��ʱ����ID:Asia/Shanghai
		System.out.println(my.getID());
		//��ȡϵͳĬ��ʱ�������ƣ��й���׼ʱ��
		System.out.println(my.getDisplayName());
		//��ȡָ��ID��ʱ�������ƣ�Ŧ������׼ʱ��
		System.out.println(TimeZone.getTimeZone("CNT").getDisplayName());
	}
}
