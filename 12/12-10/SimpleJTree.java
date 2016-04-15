import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
import java.awt.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class SimpleJTree  
{
	JFrame jf = new JFrame("����");

	JTree tree;
	//���弸����ʼ�ڵ�
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�"); 
	DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("�㶫");
	DefaultMutableTreeNode guangxi = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode foshan = new DefaultMutableTreeNode("��ɽ");
	DefaultMutableTreeNode shantou = new DefaultMutableTreeNode("��ͷ");
	DefaultMutableTreeNode guilin = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode nanning = new DefaultMutableTreeNode("����");

	public void init()
	{
		//ͨ��add�����������ڵ�֮��ĸ��ӹ�ϵ
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		//�Ը��ڵ㴴����
		tree = new JTree(root);

		//Ĭ������
		//tree.putClientProperty("JTree.lineStyle" , "Angeled");
		//û������
		tree.putClientProperty("JTree.lineStyle" , "None");
		//ˮƽ�ָ���
		//tree.putClientProperty("JTree.lineStyle" , "Horizontal"); 


		//�����Ƿ���ʾ���ڵ�ġ�չ��/�۵���ͼ��,Ĭ����false
		tree.setShowsRootHandles(true);
		//���ýڵ��Ƿ�ɼ�,Ĭ����true
		tree.setRootVisible(true);

		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

    public static void main(String[] args) 
    {
		new SimpleJTree().init();
    }
}
