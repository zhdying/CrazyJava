
import java.awt.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestPanel
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("���Դ���");
		//����һ��Panel����
		Panel p = new Panel();
		//��Panel����������������
		p.add(new TextField(20));
		p.add(new Button("������"));
		f.add(p);
		//���ô��ڵĴ�С��λ��
		f.setBounds(30, 30 , 250, 120);
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
