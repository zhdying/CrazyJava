import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestJSpinner
{
	final int SPINNER_NUM = 6;
	JFrame mainWin = new JFrame("΢��������ʾ��");
	Box spinnerBox = new Box(BoxLayout.Y_AXIS);
	JSpinner[] spinners = new JSpinner[SPINNER_NUM];
	JLabel[] valLabels = new JLabel[SPINNER_NUM];
	JButton okBn = new JButton("ȷ��");
	public void init() 
	{
		for (int i = 0 ; i < SPINNER_NUM ; i++ )
		{
			valLabels[i] = new JLabel();
		}
		//-----------��ͨSpinner-----------
		spinners[0] = new JSpinner();
		addSpinner(spinners[0], "��ͨ" , valLabels[0]);

		//-----------ָ����Сֵ�����ֵ��������Spinner-----------
		//����һ��SpinnerNumberModel����ָ����Сֵ�����ֵ�Ͳ���
		SpinnerNumberModel numModel = new SpinnerNumberModel(3.4, 
			-1.1, 4.3, 0.1); 
		spinners[1] = new JSpinner(numModel);
		addSpinner(spinners[1], "�� ֵ �� Χ" , valLabels[1]);

		//-----------ʹ��SpinnerListModel��Spinner------------
		String[] books = new String[]
		{
			"������J2EE��ҵӦ��ʵս",
			"Struts2Ȩ��ָ��",
			"����J2EE��Ajax����"
		};
		//ʹ���ַ������鴴��SpinnerListModel����
		SpinnerListModel bookModel = new SpinnerListModel(books);
		//ʹ��SpinnerListModel���󴴽�JSpinner����
		spinners[2] = new JSpinner(bookModel);
		addSpinner(spinners[2], "�ַ�������ֵ" , valLabels[2]);

		//-----------ʹ������ֵ��ImageIcon��Spinner------------
		ArrayList<ImageIcon> icons = new ArrayList<ImageIcon>();
		icons.add(new ImageIcon("a.gif"));
		icons.add(new ImageIcon("b.gif"));
		//ʹ��ImageIcon���鴴��SpinnerListModel����
		SpinnerListModel iconModel = new SpinnerListModel(icons);
		//ʹ��SpinnerListModel���󴴽�JSpinner����
		spinners[3] = new JSpinner(iconModel);
		addSpinner(spinners[3], "ͼ������ֵ" , valLabels[3]);

		//-----------ʹ��SpinnerDateModel��Spinner------------
		//�ֱ��ȡ��ʼʱ�䡢����ʱ�䡢��ʱʱ��
		Calendar cal = Calendar.getInstance();
		Date init = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH , -3);
		Date start = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH , 8);
		Date end = cal.getTime();
		//����һ��SpinnerDateModel����ָ����Сʱ�䡢���ʱ��ͳ�ʼʱ��
		SpinnerDateModel dateModel = new SpinnerDateModel(init , 
			start , end , Calendar.HOUR_OF_DAY);
		//��SpinnerDateModel���󴴽�JSpinner
		spinners[4] = new JSpinner(dateModel);
		addSpinner(spinners[4], "ʱ �� �� Χ" , valLabels[4]);

		//-----------ʹ��DateEditor����ʽ��Spinner------------
		dateModel = new SpinnerDateModel();
		spinners[5] = new JSpinner(dateModel);
		//����һ��JSpinner.DateEditor�������ڶ�ָ��Spinner���и�ʽ��
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinners[5],
			"��Ԫyyyy��MM��dd�� HHʱ");
		//����ʹ��JSpinner.DateEditor������и�ʽ��
		spinners[5].setEditor(editor);
		addSpinner(spinners[5], "ʹ��DateEditor" , valLabels[5]);
		//Ϊ��ȷ������ť���һ���¼�������
		okBn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				//ȡ��ÿ��΢����������ֵ��������ֵ�ú����Label��ǩ��ʾ������
				for (int i = 0 ; i < SPINNER_NUM ; i++)
				{
					valLabels[i].setText(spinners[i].getValue().toString());
				}
			}
		});

		JPanel bnPanel = new JPanel();
		bnPanel.add(okBn);
		mainWin.add(spinnerBox, BorderLayout.CENTER);
		mainWin.add(bnPanel, BorderLayout.SOUTH);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	
	}
	//����һ�����������ڽ���������ӵ�������
	public void addSpinner(JSpinner spinner, String description
		,JLabel valLabel)
	{
		Box box = new Box(BoxLayout.X_AXIS);
		JLabel desc = new JLabel(description + "��");
		desc.setPreferredSize(new Dimension(100 , 30));
		box.add(desc);
		box.add(spinner);
		valLabel.setPreferredSize(new Dimension(180 , 30));
		box.add(valLabel);
		spinnerBox.add(box);
	}
	public static void main(String[] args)
	{
		new TestJSpinner().init();
	}
}
