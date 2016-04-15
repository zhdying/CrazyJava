import java.awt.*;
import java.awt.event.*;

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
public class TestBindKey
{
	JFrame jf = new JFrame("���Լ��̰�");
	JTextArea jta = new JTextArea(5, 30);
	JButton jb = new JButton("����");
	JTextField jtf = new JTextField(15);
	public void init()
	{
		jf.add(jta);
		JPanel jp = new JPanel();
		jp.add(jtf);
		jp.add(jb);
		jf.add(jp , BorderLayout.SOUTH);
		//������ϢAction,Action��ActionListener���ӽӿ�
		Action sendMsg = new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append(jtf.getText() + "\n");
				jtf.setText("");
			}
		};
		//����¼�������
		jb.addActionListener(sendMsg);
		//��Ctrl+Enter����"send"����
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n', java.awt.event.InputEvent.CTRL_MASK) 
			, "send");
		//��"send"��sendMsg Action����
		jtf.getActionMap().put("send", sendMsg);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestBindKey().init();
	}
}
