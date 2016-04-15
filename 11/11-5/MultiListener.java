
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
public class MultiListener
{
	private Frame f = new Frame("����");
	private TextArea ta = new TextArea(6 , 40);
	private Button b1 = new Button("��ťһ");
	private Button b2 = new Button("��ť��");
	public void init()
	{
		FirstListener fl = new FirstListener();
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(fl);
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("��һ���¼�������������,�¼�Դ�ǣ�" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("�����ˡ�" + e.getActionCommand() + "����ť\n");
		}
	}
	public static void main(String[] args) 
	{
		new MultiListener().init();
	}
}
