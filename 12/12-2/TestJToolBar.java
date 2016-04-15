
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestJToolBar
{
	JFrame jf = new JFrame("���Թ�����");
	JTextArea jta = new JTextArea(6, 35);
	JToolBar jtb = new JToolBar();
	JMenuBar jmb = new JMenuBar();
	JMenu edit = new JMenu("�༭");
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//����"ճ��"Action����Action���ڴ����˵�����߰�ť����ͨ��ť
	Action pasteAction = new AbstractAction("ճ��", new ImageIcon("ico/paste.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			//����������а���stringFlavor����
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				try
				{
					//ȡ����������stringFlavor����
					String content = (String)clipboard.getData(DataFlavor.stringFlavor);
					//��ѡ�������滻�ɼ������е�����
					jta.replaceRange(content , jta.getSelectionStart() , jta.getSelectionEnd());
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		}
	};
	//����"����"Action
	Action copyAction = new AbstractAction("����", new ImageIcon("ico/copy.png"))
	{
		public void actionPerformed(ActionEvent e)
		{
			StringSelection contents = new StringSelection(jta.getSelectedText());
			//��StringSelection������������
			clipboard.setContents(contents, null);
			//����������а���stringFlavor����
			if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
			{
				//��pasteAction����
				pasteAction.setEnabled(true);
			}
		}
	};
	public void init()
	{
		//pasteActionĬ�ϴ��ڲ�����״̬
		pasteAction.setEnabled(false);
		jf.add(new JScrollPane(jta));
		//��Action������ť�������ð�ť��ӵ�Panel��
		JButton copyBn = new JButton(copyAction);
		JButton pasteBn = new JButton(pasteAction);
		JPanel jp = new JPanel();
		jp.add(copyBn);
		jp.add(pasteBn);
		jf.add(jp , BorderLayout.SOUTH);
		//�򹤾��������Action���󣬸ö��󽫻�ת���ɹ��߰�ť
		jtb.add(copyAction);
		jtb.addSeparator();
		jtb.add(pasteAction);
		//��˵������Action���󣬸ö��󽫻�ת���ɲ˵���
		edit.add(copyAction);
		edit.add(pasteAction);
		//��edit�˵���ӵ��˵�����
		jmb.add(edit);
		jf.setJMenuBar(jmb);
		//���ù������͹��߰�ť֮��ľ���
		jtb.setMargin(new Insets(20 ,10 , 5 , 30));
		//�򴰿�����ӹ�����
		jf.add(jtb , BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestJToolBar().init();
	}
}
