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
public class TestBoxLayout
{
	private Frame f = new Frame("����");
	public void init()
	{
		f.setLayout(new BoxLayout(f , BoxLayout.Y_AXIS));
		f.add(new Button("��һ����ť"));
		f.add(new Button("��ť��"));
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestBoxLayout().init();
	}
}
