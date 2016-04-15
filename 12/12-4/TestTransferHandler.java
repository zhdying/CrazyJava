
import java.awt.*;
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
public class TestTransferHandler
{
	private JFrame jf = new JFrame("����TransferHandler");
	JColorChooser chooser = new JColorChooser();
	JTextArea txt = new JTextArea("����TransferHandler\n" + 
		"ֱ�ӽ�������ɫ�����Ըı��ı���ɫ");
	public void init()
	{
		chooser.setDragEnabled(true);
		jf.add(chooser, BorderLayout.SOUTH);
		txt.setDragEnabled(true);
		txt.setTransferHandler(new TransferHandler("foreground"));
		jf.add(new JScrollPane(txt));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestTransferHandler().init();
	}
}
