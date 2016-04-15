import java.awt.event.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import javax.swing.AbstractButton;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
//����һ��ע�ʹ�������
public class ActionListenerInstaller
{
	//����ע�͵ķ���������obj�ǰ���ע�͵Ķ���
	public static void processAnnotations(Object obj)
	{
		try
		{
			//��ȡobj�������
			Class cl = obj.getClass();
			//��ȡָ��obj���������Field��������ÿ��Field
			for (Field f : cl.getDeclaredFields())
			{
				//��ָ��Field���óɿ����ɷ��ʵģ�����private��Field���ɷ���
				f.setAccessible(true);
				//��ȡָ��Field�ġ�ActionListenerFor���͵�ע��
				ActionListenerFor a = f.getAnnotation(ActionListenerFor.class);
				if (a != null && a instanceof AbstractButton) 
				{
					//��ȡaע�����Ԫ����listner������һ���������ࣩ
					Class listenerClazz = Class.forName(a.listener());
					//ʹ�÷���������listner��Ķ���
					ActionListener al = (ActionListener)listenerClazz.newInstance();
					//��ȡf Fieldʵ�ʶ�Ӧ�Ķ���
					AbstractButton ab = (AbstractButton )f.get(obj);
					//Ϊab��������¼�������
					ab.addActionListener(al);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
