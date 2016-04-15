
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestJTextPane
{
	JFrame mainWin = new JFrame("����JTextPane");
	JTextPane txt = new JTextPane();
	StyledDocument doc = txt.getStyledDocument();
	//������������
	SimpleAttributeSet ror = new SimpleAttributeSet();
	SimpleAttributeSet struts2 = new SimpleAttributeSet();
	SimpleAttributeSet j2ee = new SimpleAttributeSet();


	public void init()
	{
		//Ϊror���Լ�������ɫ�������С��������»���
        StyleConstants.setForeground(ror, Color.RED);
		StyleConstants.setFontSize(ror, 24);
		StyleConstants.setFontFamily(ror, "Dialog");
		StyleConstants.setUnderline(ror, true);

		//Ϊstruts2���Լ�������ɫ�������С������ʹ�����
        StyleConstants.setForeground(struts2, Color.BLUE);
		StyleConstants.setFontSize(struts2, 30);
		StyleConstants.setFontFamily(struts2, "Arial Black");
		StyleConstants.setBold(struts2, true);


		//Ϊj2ee���Լ�������ɫ�������С��б����
		StyleConstants.setForeground(j2ee, Color.GREEN);
		StyleConstants.setFontSize(j2ee, 32);
		StyleConstants.setItalic(j2ee, true);

		 
		//���ò�����༭
		txt.setEditable(false);
	
		txt.setText("ROR���ݿ������ʵ��\n"
			+ "Struts2Ȩ��ָ��\n"
			+ "������J2EE��ҵӦ��ʵս\n");
	
		//�ֱ�Ϊ�ĵ��������������ò�ͬ�������ʽ
		doc.setCharacterAttributes(0 , 12 , 
			ror, true);
		doc.setCharacterAttributes(12 , 12 , 
			struts2, true);
		doc.setCharacterAttributes(24 , 30 , 
			j2ee, true);	

		mainWin.add(new JScrollPane(txt), BorderLayout.CENTER);

		//��ȡ��Ļ�ߴ�
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int inset = 100;
		//���������ڵĴ�С
        mainWin.setBounds ( inset, inset, 
			screenSize.width - inset * 2, screenSize.height - inset * 2 );
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
   }

	public static void main(String[] args) 
	{
		new TestJTextPane().init();
	}
}
