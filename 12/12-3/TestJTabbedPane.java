import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
public class TestJTabbedPane
{
	JFrame jf = new JFrame("����Tabҳ��");
	//����һ��Tabҳ��ı�ǩ������ߣ����û��в��ֲ��Ե�JTabbedPane
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT , JTabbedPane.WRAP_TAB_LAYOUT);	
	ImageIcon icon = new ImageIcon("ico/close.gif");
	String[] layouts = {"���в���" , "����������"};
	String[] positions = {"���" , "����" , "�ұ�" , "�ײ�"};
	Map<String , String> books = new LinkedHashMap<String , String>();

	public void init()
	{
		books.put("ROR���ݿ������ʵ��" , "ror.jpg");
		books.put("Struts2Ȩ��ָ��" , "struts2.jpg");
		books.put("����J2EE��Ajax����" , "ajax.jpg");
		books.put("������J2EE��ҵӦ��ʵս" , "j2ee.jpg");
		books.put("Spring2.0����" , "spring.jpg");
		String tip = "�ɿ�������ķ�����Ƭ";
		//��JTabbedPane�����5��Tabҳ�棬ָ���˱��⡢ͼ�����ʾ������Tabҳ������Ϊnull
		for (String bookName : books.keySet())
		{
			tabbedPane.addTab(bookName, icon, null , tip);
		}
		jf.add(tabbedPane, BorderLayout.CENTER);
		//ΪJTabbedPane����¼�������
		tabbedPane.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent event)
			{		
				//�����ѡ��������Ȼ�ǿ�
				if (tabbedPane.getSelectedComponent() == null)
				{
					//��ȡ��ѡTabҳ
					int n = tabbedPane.getSelectedIndex();
					//Ϊָ����ǰҳ��������
					loadTab(n);
				}
			}
		});
		//ϵͳĬ��ѡ���һҳ�����ص�һҳ����
		loadTab(0);
		tabbedPane.setPreferredSize(new Dimension(500 , 300));
		//���ӿ��Ʊ�ǩ���֡���ǩλ�õĵ�ѡ��ť
		JPanel buttonPanel = new JPanel();
		ChangeAction action = new ChangeAction();
		buttonPanel.add(new ButtonPanel(action , "ѡ���ǩ���ֲ���" ,layouts));
		buttonPanel.add (new ButtonPanel(action , "ѡ���ǩλ��" ,positions));
		jf.add(buttonPanel, BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);

	}
	//Ϊָ����ǩҳ��������
	private void loadTab(int n)
	{
		String title = tabbedPane.getTitleAt(n);
		//���ݱ�ǩҳ�ı����ȡ��Ӧͼ�����
		ImageIcon bookImage = new ImageIcon("ico/" + books.get(title));
		tabbedPane.setComponentAt(n, new JLabel(bookImage));
		//�ı��ǩҳ��ͼ��
		tabbedPane.setIconAt(n, new ImageIcon("ico/open.gif"));
	}
	//����ı��ǩҳ�Ĳ��ֲ��ԣ�����λ�õļ�����
	class ChangeAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JRadioButton source = (JRadioButton)event.getSource();
			String selection = source.getActionCommand();
			if (selection.equals(layouts[0]))
			{
				tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
			}
			else if (selection.equals(layouts[1]))
			{
				tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			}
			else if (selection.equals(positions[0]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.LEFT);
			}
			else if (selection.equals(positions[1]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.TOP);
			}
			else if (selection.equals(positions[2]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
			}
			else if (selection.equals(positions[3]))
			{
				tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
			}
		}
	}

	public static void main(String[] args)
	{  
		new TestJTabbedPane().init();
	}
}

//����һ��JPanel����չ�࣬����Ķ����������������е�JRadioButton�ؼ�
//��Panel��չ�����ָ��һ���ַ�����ΪTitledBorder
class ButtonPanel extends JPanel
{  
	private ButtonGroup group;
	public ButtonPanel(TestJTabbedPane.ChangeAction action , String title, String[] labels)
	{  
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		group = new ButtonGroup();
		for (int i = 0; labels!= null && i < labels.length; i++)
		{  
			JRadioButton b = new JRadioButton(labels[i]);
			b.setActionCommand(labels[i]);
			add(b);
			//����¼�������
			b.addActionListener(action);
			group.add(b);
			b.setSelected(i == 0);
		}
	}
}

