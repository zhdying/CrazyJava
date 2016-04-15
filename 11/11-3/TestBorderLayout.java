
import java.awt.*;
import static java.awt.BorderLayout.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestBorderLayout
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��") , SOUTH);
		f.add(new Button("��") , NORTH);
		//Ĭ����ӵ��м�
		f.add(new Button("��"));
		f.add(new Button("��") , EAST);
		f.add(new Button("��") , WEST);
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
