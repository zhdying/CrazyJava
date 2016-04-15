import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestDefaultListModel
{
	private JFrame mainWin = new JFrame("����DefaultListModel");
	//����һ��JList����
	private JList bookList;
	//����һ��DefaultListModel����
	private DefaultListModel bookModel = new DefaultListModel();
	private JTextField bookName = new JTextField(20);
	private JButton removeBn = new JButton("ɾ��ѡ��ͼ��") ;
	private JButton addBn = new JButton("���ָ��ͼ��");

	public void init()
	{
		//��bookModel�����Ԫ��
		bookModel.addElement("Spring2.0����");
		bookModel.addElement("������J2EE��ҵӦ��ʵս");
		bookModel.addElement("����J2EE��Ajax����");
		bookModel.addElement("Struts2Ȩ��ָ��");
		bookModel.addElement("ROR���ݿ������ʵ��");
		//����DefaultListModel���󴴽�һ��JList����
		bookList = new JList(bookModel);
		//���������Ӹ߶�
		bookList.setVisibleRowCount(4); 
		//ֻ�ܵ�ѡ
		bookList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		//Ϊ��Ӱ�ť����¼�������
		addBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//��bookName�ı�������ݲ�Ϊ�ա�
				if (!bookName.getText().trim().equals(""))
				{
					//��bookModel�����һ��Ԫ�أ�ϵͳ�Զ�����JList����Ӷ�Ӧ���б���
					bookModel.addElement(bookName.getText());
				}
			}
		});
		//Ϊɾ����ť����¼�������
		removeBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//����û��Ѿ�ѡ�е�һ��
				if (bookList.getSelectedIndex() >= 0)
				{
					//��bookModel��ɾ��ָ����������Ԫ�أ�ϵͳ�Զ���ɾ��JList��Ӧ���б���
					bookModel.removeElementAt(bookList.getSelectedIndex());
				}

			}
		});

		JPanel p = new JPanel();
		p.add(bookName);
		p.add(addBn);
		p.add(removeBn);
		//���bookList���
		mainWin.add(new JScrollPane(bookList));
		//��p�����ӵ�������
		mainWin.add(p , BorderLayout.SOUTH);

		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);

	}

	public static void main(String[] args) 
	{
		new TestDefaultListModel().init();
	}
}
