
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
public class CopyPerson
{
	Frame f = new Frame("���ƶ���");
	Button copy = new Button("����");
	Button paste = new Button("ճ��");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//�������صļ�����
	Clipboard clipboard = new Clipboard("cp");
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("����"));
		p.add(name);
		p.add(new Label("����"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		//Ϊ�����ơ���ť����¼�������
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyPerson();
			}
		});
		//Ϊ��ճ������ť����¼�������
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readPerson();
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		});
		bp.add(copy);
		bp.add(paste);
		f.add(bp , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);		
	}
	public void copyPerson()
	{
		//��name,age�ı�������ݴ���Person����
		Person p = new Person(name.getText() , Integer.parseInt(age.getText()));
		//��Person�����װ��LocalSelection����
		LocalSelection ls = new LocalSelection(p);
		//��LocalSelection������뱾�ؼ�����
		clipboard.setContents(ls , null);
	}
	public void readPerson()throws Exception
	{
		//��������Person�������õ�DataFlavor����
		DataFlavor peronFlavor = new DataFlavor("application/x-java-jvm-local-objectref;class=Person");
		//ȡ�����ؼ������ڵ�����
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			Person p = (Person)clipboard.getData(peronFlavor);
			ta.setText(p.toString());
		}
	}
	public static void main(String[] args) 
	{
		new CopyPerson().init();
	}
}
class Person 
{
	private String name;
	private int age;

	public Person(){}

	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		 return this.age;
	}
	public String toString()
	{
		return "Person����[ name=" + name + " , age=" + age + " ]";
	}
}
