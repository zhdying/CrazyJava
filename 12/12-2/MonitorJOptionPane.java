import java.awt.*;
import java.awt.event.*;
import java.beans.*;
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
public class MonitorJOptionPane
{
	JFrame jf = new JFrame("����JOptionPane");
	JTextArea jta = new JTextArea(5 , 40);
	JButton bn = new JButton("�򿪶Ի���");
	JOptionPane jop = new JOptionPane("���ԶԻ���", JOptionPane.WARNING_MESSAGE
		,JOptionPane.YES_NO_CANCEL_OPTION );
	public void init()
	{
		jop.addPropertyChangeListener(new PropertyChangeListener()
		{
			public void propertyChange(PropertyChangeEvent evt)
			{
				jta.append("�û��ı���ѡ����ѡ��Ϊ��" + evt.getOldValue()
					+ "\n��ѡ��Ϊ��" + evt.getNewValue() + "!\n");
			}
		});
		bn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jop.createDialog(jf, "���ԶԻ���").setVisible(true);
				jta.append(jop.getValue() + "\n");
			}
		});
		jf.add(new JScrollPane(jta));
		JPanel jp = new JPanel();
		jp.add(bn);
		jf.add(jp, BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MonitorJOptionPane().init();
	}
}
