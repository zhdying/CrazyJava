
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

//��A��equals�������Ƿ���true,��û����д��hashCode()����
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
//��B��hashCode()�������Ƿ���1,��û����д��equals()����
class B
{
	public int hashCode()
	{
		return 1;
	}
}
//��C��hashCode()�������Ƿ���2,��û����д��equals()����
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class TestHashSet
{
	public static void main(String[] args) 
	{
		HashSet books = new HashSet();
		//�ֱ���books���������2��A����2��B����2��C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}