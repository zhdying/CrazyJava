import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
//��չHashMap�࣬MyMap��Ҫ��valueҲ�����ظ�
public class YeekuMap<K,V> extends HashMap<K,V>
{
	//����value��ɾ��ָ����
	public void removeByValue(Object value) 
	{
		for (Object key : keySet())
		{
			if (get(key) == value)
			{
				remove(key);
				break;
			}
		}
	}

	//��ȡ����value��ɵ�Set����
	public Set<V> valueSet() 
	{
		Set<V> result = new HashSet<V>();
		//��������key��ɵļ���
		for (K key : keySet())
		{
			//��ÿ��key��Ӧ��value��ӵ�result������
			result.add(get(key));
		}
		return result;
	}

	//����value����key��
	public K getKeyByValue(V val) 
	{
		//��������key��ɵļ���
		for (K key : keySet())
		{
			//���ָ��key��Ӧ��value�뱻������value��ͬ
			//�򷵻ض�Ӧ��key
			if (get(key).equals(val) 
				&& get(key) == val)
			{
				return key;
			}
		}
		return null;
	}
	//��дHashMap��put�������÷���������value�ظ�
	public V put(K key,V value)
	{
		//��������value��ɵļ���
		for (V val : valueSet() )
		{
			//���ָ��value����ͼ���뼯�ϵ�value��ͬ
			//���׳�һ��RuntimeException�쳣
			if (val.equals(value) 
				&& val.hashCode() == value.hashCode())
			{
				throw new RuntimeException
					("MyMapʵ���в��������ظ�value!"); 
			}
		}
		return super.put(key , value);
	}
}
    