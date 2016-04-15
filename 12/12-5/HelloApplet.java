
import javax.swing.*;
import java.applet.*;
import java.awt.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class HelloApplet extends JApplet
{


	//��ʼ��Applet�ķ���
	public void init()
	{
		setLayout(new FlowLayout());
		add(new JButton("XXX"));
		add(new JButton("YYY"));
	}
	//����Applet�ķ���
	public void start()
	{
		System.out.println("start����");
	}
	//����Applet����ķ���
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("paint����");
		g.drawLine(3 , 3 , 200 , 300);
	}
	//ֹͣApplet�ķ���
	public void stop()
	{
		System.out.println("stop����");
	}
	//����Applet�ķ���
	public void destroy()
	{
		System.out.println("destroy����");
	}
	public static void main(String[] args)
	{
		JFrame jf = new JFrame();
		JApplet panel = new HelloApplet();
		panel.setPreferredSize(new Dimension(300, 400));
		//��ʽ����HelloApplet�����init��start����
		panel.init();
		panel.start();
		jf.add(panel);
		jf.pack();
		jf.setVisible(true);
	}
}
