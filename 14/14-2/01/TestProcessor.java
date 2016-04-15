
import java.lang.reflect.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestProcessor
{
	public static void process(String clazz)
		throws ClassNotFoundException
	{
		int passed = 0;
		int failed = 0;
		//����obj��������з���
		for (Method m : Class.forName(clazz).getMethods()) 
		{
			//�������@Testable���ע��
			if (m.isAnnotationPresent(Testable.class))
			{
				try 
				{
					//����m����
					m.invoke(null);
					//passed��1
					passed++;
				}
				catch (Exception ex)
				{
					System.out.printf("����" + m + "����ʧ�ܣ��쳣��" + ex.getCause() + "\n");
					failed++; 
				}
			}
		}
		//ͳ�Ʋ��Խ��
		System.out.printf("��������:" + (passed + failed)+ "�����������У�\n" + 
			"ʧ����:" + failed + "����\n" +  
			"�ɹ���:" + passed + "����\n"); 
	}
}
