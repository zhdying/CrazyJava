
import java.awt.*;
import java.awt.event.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestDialog
{
	Frame f = new Frame("����");	
	Dialog d1 = new Dialog(f, "ģʽ�Ի���" , true);
	Dialog d2 = new Dialog(f, "��ģʽ�Ի���" , false);
	Button b1 = new Button("��ģʽ�Ի���");
	Button b2 = new Button("�򿪷�ģʽ�Ի���");
	public void init()
	{
		d1.setBounds(20 , 30 , 300, 400);
		d2.setBounds(20 , 30 , 300, 400);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d1.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				d2.setVisible(true);
			}
		});
		f.add(b1);
		f.add(b2 , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestDialog().init();
	}
}
