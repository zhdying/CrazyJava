import java.nio.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BufferTest
{
	public static void main(String[] args)
	{
		//����Buffer
		CharBuffer buff = CharBuffer.allocate(8);	//1
		System.out.println("capacity: "
			+ buff.capacity());
	  	System.out.println("limit: "
			+ buff.limit());
	  	System.out.println("position: "
			+ buff.position());
		//����Ԫ��
	  	buff.put('a');	//2
	  	buff.put('b');	//3
	  	buff.put('c');	//4
	  	
	  	System.out.println("��������Ԫ�غ�position = "
			+ buff.position());
	  	//����flip()����
	  	buff.flip();	//5
	  	System.out.println("ִ��flip()��limit = "
			+ buff.limit());
	  	System.out.println("position = "
			+ buff.position());
	  	//ȡ����һ��Ԫ��
	  	System.out.println("��һ��Ԫ�أ�position=0����"
			+ buff.get());	//6	  	
	  	System.out.println("ȡ��һ��Ԫ�غ�position = "
			+ buff.position());
	  	//����clear����
	  	buff.clear();	//7
	  	System.out.println("ִ��clear()��limit = "
			+ buff.limit());	
	  	System.out.println("ִ��clear()��position = "
			+ buff.position());
	  	System.out.println("ִ��clear()�󣬻��������ݲ�û�б������"
			+ buff.get(2));	//8
		System.out.println("ִ�о��Զ�ȡ��position = "
			+ buff.position());
	} 
}