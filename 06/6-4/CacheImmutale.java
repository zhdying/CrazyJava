

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CacheImmutale
{
	private final String name;
	private static CacheImmutale[] cache = new CacheImmutale[10];
	//��¼����ʵ���ڻ����е�λ��,cache[pos-1]�����»����ʵ��
	private static int pos = 0;

	public CacheImmutale(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public static CacheImmutale valueOf(String name)
	{
		//�����ѻ���Ķ���
		for (int i = 0 ; i < pos; i++)
		{
			//���������ͬʵ����ֱ�ӷ��ظû����ʵ��
			if (cache[i] != null && cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}
		//������������
		if (pos == 10)
		{
			//�ѻ���ĵ�һ�����󸲸�
			cache[0] = new CacheImmutale(name);
			//��pos��Ϊ1
			pos = 1;
			return cache[0];
		}
		else
		{
			//���´����Ķ��󻺴�������pos��1
			cache[pos++] = new CacheImmutale(name);
			return cache[pos - 1];		
		}
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof CacheImmutale)
		{
			CacheImmutale ci = (CacheImmutale)obj;
			if (name.equals(ci.getName()))
			{
				return true;
			}
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode();
	}
	public static void main(String[] args)
	{
		CacheImmutale c1 = CacheImmutale.valueOf("hello");
		CacheImmutale c2 = CacheImmutale.valueOf("hello");
		//������뽫���true
		System.out.println(c1 == c2);
	}
}
