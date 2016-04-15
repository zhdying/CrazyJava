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
public class TestList
{
	private JFrame mainWin = new JFrame("�����б��");
	String[] books = new String[]
	{
		"Spring2.0����",
		"������J2EE��ҵӦ��ʵս",
		"����J2EE��Ajax����",
		"Struts2Ȩ��ָ��",
		"ROR���ݿ������ʵ��"
	};
	JList bookList = new JList(books);
	JComboBox bookSelector;
	//���岼��ѡ��ť���ڵ����
	JPanel layoutPanel = new JPanel();
	ButtonGroup layoutGroup = new ButtonGroup();
	//����ѡ��ģʽ��ť���ڵ����
	JPanel selectModePanel = new JPanel();
	ButtonGroup selectModeGroup = new ButtonGroup();
	JTextArea favoriate = new JTextArea(4 , 40);

	public void init()
	{
		//JList�Ŀ��Ӹ߶ȿ�ͬʱ��ʾ�����б���
		bookList.setVisibleRowCount(3); 
		//Ĭ��ѡ�е�����������һ���������0��
		bookList.setSelectionInterval(2, 4);
		addLayoutButton("�������", JList.VERTICAL);
		addLayoutButton("������", JList.VERTICAL_WRAP);
		addLayoutButton("������", JList.HORIZONTAL_WRAP);
		addSelectModelButton("������", ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		addSelectModelButton("��ѡ", ListSelectionModel.SINGLE_SELECTION);
		addSelectModelButton("����Χ", ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		Box listBox = new Box(BoxLayout.Y_AXIS);
		//��JList�������JScrollPane�У��ٽ���JScrollPane��ӵ�listBox������
		listBox.add(new JScrollPane(bookList));
		//��Ӳ���ѡ��ť��塢ѡ��ģʽ��ť���
		listBox.add(layoutPanel);
		listBox.add(selectModePanel);
		//ΪJList����¼�������
		bookList.addListSelectionListener(new ListSelectionListener()
		{
			public void  valueChanged(ListSelectionEvent e)
			{
				//��ȡ�û���ѡ�������ͼ��
				Object[] books = bookList.getSelectedValues();
				favoriate.setText("");
				for (Object book : books )
				{
					favoriate.append(book.toString() + "\n");
				}
			}
		});

		Vector<String> bookCollection = new Vector<String>();
		bookCollection.add("Spring2.0����");
		bookCollection.add("������J2EE��ҵӦ��ʵս");
		bookCollection.add("����J2EE��Ajax����");
		bookCollection.add("Struts2Ȩ��ָ��");
		bookCollection.add("ROR���ݿ������ʵ��");
		//��һ��Vector����������һ��JComboBox����
		bookSelector = new JComboBox(bookCollection);
		//ΪJComboBox����¼�������
		bookSelector.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e) 
			{
				//��ȡJComboBox��ѡ�е���
				Object book = bookSelector.getSelectedItem();
				favoriate.setText(book.toString());
			}
		});
		
		//���ÿ���ֱ�ӱ༭
		bookSelector.setEditable(true);
		//���������б��Ŀ��Ӹ߶ȿ�ͬʱ��ʾ4���б���
		bookSelector.setMaximumRowCount(4);


		JPanel p = new JPanel();
		p.add(bookSelector);
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(listBox);
		box.add(p);
		mainWin.add(box);
		JPanel favoriatePanel = new JPanel();
		favoriatePanel.setLayout(new BorderLayout());
		favoriatePanel.add(new JScrollPane(favoriate));
		favoriatePanel.add(new JLabel("��ϲ����ͼ�飺") , BorderLayout.NORTH);
		mainWin.add(favoriatePanel , BorderLayout.SOUTH);

		
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}

	private void addLayoutButton(String label, final int orientation)
	{
		layoutPanel.setBorder(new TitledBorder(new EtchedBorder(), "ȷ��ѡ���"));
		JRadioButton button = new JRadioButton(label);
		//�Ѹõ�ѡ��ť��ӵ�layoutPanel�����
		layoutPanel.add(button);
		//Ĭ��ѡ�е�һ����ť
		if (layoutGroup.getButtonCount() == 0) 
			button.setSelected(true);
		layoutGroup.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//�ı��б�����б���Ĳ��ַ���
				bookList.setLayoutOrientation(orientation);
			}
		});
	}
	private void addSelectModelButton(String label, final int selectModel)
	{
		selectModePanel.setBorder(new TitledBorder(new EtchedBorder(), "ȷ��ѡ��ģʽ"));
		JRadioButton button = new JRadioButton(label);
		//�Ѹõ�ѡ��ť��ӵ�selectModePanel�����
		selectModePanel.add(button);
		//Ĭ��ѡ�е�һ����ť
		if (selectModeGroup.getButtonCount() == 0) 
			button.setSelected(true);
		selectModeGroup.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//�ı��б�����ѡ��ģʽ
				bookList.setSelectionMode(selectModel);
			}
		});
	}

	public static void main(String[] args) 
	{
		new TestList().init();
	}
}
