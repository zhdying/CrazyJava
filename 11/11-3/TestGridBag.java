
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
public class TestGridBag
{
	private Frame f = new Frame("���Դ���");
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] bs = new Button[10];
	public void init()
	{
		f.setLayout(gb);
		for (int i = 0; i < bs.length ; i++ )
		{
			bs[i] = new Button("��ť" + i);
		}
		//������������Ժ�������������
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        addButton(bs[0]);
        addButton(bs[1]);
        addButton(bs[2]);
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ��Ԫ��
		gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[3]);
		//��GridBagConstraints���Ƶ�GUI����������ϲ�������
        gbc.weightx = 0;
        addButton(bs[4]);
		//��GridBagConstraints���Ƶ�GUI��������2������
		gbc.gridwidth = 2;
        addButton(bs[5]);
		//��GridBagConstraints���Ƶ�GUI��������1������
		gbc.gridwidth = 1;
		//��GridBagConstraints���Ƶ�GUI����������2������
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ��Ԫ��
		gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[6]);
		//��GridBagConstraints���Ƶ�GUI����������Խһ�����������Խ2������
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI������������Ȩ����1
        gbc.weighty = 1;
        addButton(bs[7]);
		//��������İ�ť�������ϲ�������
        gbc.weighty = 0;
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ��Ԫ��
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		//��GridBagConstraints���Ƶ�GUI����������Ϻ��1������
		gbc.gridheight = 1;
        addButton(bs[8]);
        addButton(bs[9]);
		f.pack();
		f.setVisible(true);
	}
    private void addButton(Button button) 
	{
        gb.setConstraints(button, gbc);
        f.add(button);
    }
	public static void main(String[] args) 
	{
		new TestGridBag().init();
	}
}
