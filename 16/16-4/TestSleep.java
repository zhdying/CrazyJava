
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestSleep
{
    public static void main(String[] args) throws Exception
    {
		for (int i = 0; i < 10 ; i++ )
		{
			System.out.println("��ǰʱ��: " + new Date());
			//����sleep�����õ�ǰ�߳���ͣ1s��
			Thread.sleep(1000);
		}
    }
}
