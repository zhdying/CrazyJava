
import javax.imageio.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestImageIO
{
	public static void main(String[] args) 
	{
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("-----Image�ܶ�������ͼ���ļ���ʽ-----");
		for (String tmp : readFormat)
		{
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----Image��д������ͼ���ļ���ʽ-----");
		for (String tmp : writeFormat)
		{
			System.out.println(tmp);
		}
	}
}
