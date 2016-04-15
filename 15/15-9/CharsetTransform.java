
import java.nio.charset.*;
import java.nio.*;
/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CharsetTransform
{
	public static void main(String[] args)
		throws Exception
	{
		//�����������Ķ�Ӧ��Charset
		Charset cn = Charset.forName("GBK");
		//��ȡcn�����Ӧ�ı������ͽ�����
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();
		//����һ��CharBuffer����
		CharBuffer cbuff = CharBuffer.allocate(8);
		cbuff.put('��');
		cbuff.put('��');
		cbuff.put('��');
		cbuff.flip();
		//��CharBuffer�е��ַ�����ת�����ֽ�����
		ByteBuffer bbuff = cnEncoder.encode(cbuff);
		//ѭ������ByteBuffer�е�ÿ���ֽ�
		for (int i = 0; i < bbuff.capacity() ; i++)
		{
			System.out.print(bbuff.get(i) + " ");
		}
		//��ByteBuffer�����ݽ�����ַ�����
		System.out.println("\n"
			+ cnDecoder.decode(bbuff));
	}
}
