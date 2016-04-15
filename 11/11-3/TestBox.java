import java.awt.*;
import javax.swing.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestBox
{
	private Frame f = new Frame("����");
	//����ˮƽ�ڷ������Box����
	private Box horizontal = Box.createHorizontalBox();
	//���崹ֱ�ڷ������Box����
	private Box vertical = Box.createVerticalBox();
	public void init()
	{
		horizontal.add(new Button("ˮƽ��ťһ"));
		horizontal.add(new Button("ˮƽ��ť��"));
		vertical.add(new Button("��ֱ��ťһ"));
		vertical.add(new Button("��ֱ��ť��"));
		f.add(horizontal , BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestBox().init();
	}
}
