import javax.swing.*;
import java.awt.event.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("ʹ��ע�Ͱ��¼�������");
	//ʹ��ע��Ϊok��ť���¼�������
	@ActionListenerFor(listener="OkListener")
	private JButton ok = new JButton("ȷ��");
	//ʹ��ע��Ϊcancel��ť���¼�������
	@ActionListenerFor(listener="CancelListener")
	private JButton cancel = new JButton("ȡ��");
	
	public void init()
	{
		//��ʼ������ķ���
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new AnnotationTest().init();
	}

}
class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȷ�ϰ�ť");
	}
}
class CancelListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "������ȡ����ť");
	}
}