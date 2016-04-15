
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
public class TestRandom
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		System.out.println("rand.nextBoolean()��" + rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//����0.0~1.0֮���α���double��
		System.out.println("rand.nextDouble()��" + rand.nextDouble());
		//����0.0~1.0֮���α���float��
		System.out.println("rand.nextFloat()��" + rand.nextFloat());
		//����ƽ��ֵ�� 0.0����׼���� 1.0��α��˹��
		System.out.println("rand.nextGaussian()��" + rand.nextGaussian());
		//����һ������long����ȡֵ��Χ��α�������
		System.out.println("rand.nextInt()��" + rand.nextInt());
		//����0~26֮���α�������
		System.out.println("rand.nextInt(26)��" + rand.nextInt(26));
		//����һ������long����ȡֵ��Χ��α�������
		System.out.println("rand.nextLong()��" +  rand.nextLong());
	}
}
