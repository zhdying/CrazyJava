
import java.awt.*;
import static java.awt.FlowLayout.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestFlowLayout
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��FlowLayout���ֹ�����
		f.setLayout(new FlowLayout(LEFT , 20, 5));
		//�򴰿������10����ť
		for (int i = 0; i < 10 ; i++ )
		{
			f.add(new Button("��ť" + i));
		}
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
