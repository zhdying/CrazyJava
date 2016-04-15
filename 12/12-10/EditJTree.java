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
public class EditJTree
{
	JFrame jf;

	JTree tree;
	//����JTree�����Ӧ��model
	DefaultTreeModel model;
	
	//���弸����ʼ�ڵ�
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�"); 
	DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("�㶫");
	DefaultMutableTreeNode guangxi = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode foshan = new DefaultMutableTreeNode("��ɽ");
	DefaultMutableTreeNode shantou = new DefaultMutableTreeNode("��ͷ");
	DefaultMutableTreeNode guilin = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode nanning = new DefaultMutableTreeNode("����");

	//������Ҫ���϶���TreePath
	TreePath movePath;

    JButton addSiblingButton = new JButton("����ֵܽڵ�");
    JButton addChildButton = new JButton("����ӽڵ�");
    JButton deleteButton = new JButton("ɾ���ڵ�");
    JButton editButton = new JButton("�༭��ǰ�ڵ�");

	public void init()
	{
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		
		jf = new JFrame("��");
		tree = new JTree(root);
		//��ȡJTree��Ӧ��TreeModel����
		model = (DefaultTreeModel)tree.getModel();
		//����JTree�ɱ༭
		tree.setEditable(true);
		MouseListener ml = new MouseAdapter() 
		{
			//�������ʱ���ñ��϶��Ľڵ�
			public void mousePressed(MouseEvent e)
			{
				//�����ҪΨһȷ��ĳ���ڵ㣬����ͨ��TreePath����ȡ��
				TreePath tp = tree.getPathForLocation(e.getX(), e.getY());
				if (tp != null)
				{
					movePath = tp;
				}
			}
			//����ɿ�ʱ�����Ҫ�ϵ��ĸ����ڵ�
			public void mouseReleased(MouseEvent e)
			{
				//��������ɿ�ʱ��TreePath����ȡTreePath
				TreePath tp = tree.getPathForLocation(e.getX(), e.getY());

				if (tp != null && movePath != null)
				{
					//��ֹ���ӽڵ��϶�
					if (movePath.isDescendant(tp) && movePath != tp)
					{
						JOptionPane.showMessageDialog(jf, "Ŀ��ڵ��Ǳ��ƶ��ڵ���ӽڵ㣬�޷��ƶ���", 
							"�Ƿ�����", JOptionPane.ERROR_MESSAGE );
						return;
					}
					//�Ȳ������ӽڵ��ƶ���������갴�¡��ɿ��Ĳ���ͬһ���ڵ�
					else if (movePath != tp)
					{
						System.out.println(tp.getLastPathComponent());
						//add���������Ƚ�ԭ�ڵ��ԭ���ڵ�ɾ��������ӵ��¸��ڵ���
						((DefaultMutableTreeNode)tp.getLastPathComponent()).add(
							(DefaultMutableTreeNode)movePath.getLastPathComponent());
						movePath = null;
						tree.updateUI();
					}
				}
			}
		};
		tree.addMouseListener(ml);

		JPanel panel = new JPanel();

		addSiblingButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//��ȡѡ�нڵ�
				DefaultMutableTreeNode selectedNode
					= (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				//����ڵ�Ϊ�գ�ֱ�ӷ���
				if (selectedNode == null) return;
				//��ȡ��ѡ�нڵ�ĸ��ڵ�
				DefaultMutableTreeNode parent
					= (DefaultMutableTreeNode)selectedNode.getParent();
				//������ڵ�Ϊ�գ�ֱ�ӷ���
				if (parent == null) return;
				//����һ���½ڵ�
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("�½ڵ�");
				//��ȡѡ�нڵ��ѡ������
				int selectedIndex = parent.getIndex(selectedNode);
				//��ѡ��λ�ò����½ڵ�
				model.insertNodeInto(newNode, parent, selectedIndex + 1);
				//--------�������ʵ����ʾ�½ڵ㣨�Զ�չ�����ڵ㣩-------
				//��ȡ�Ӹ��ڵ㵽�½ڵ�����нڵ�
				TreeNode[] nodes = model.getPathToRoot(newNode);
				//ʹ��ָ���Ľڵ�����������TreePath
				TreePath path = new TreePath(nodes);
				//��ʾָ��TreePath
				tree.scrollPathToVisible(path);
			}
		});
		panel.add(addSiblingButton);

		addChildButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//��ȡѡ�нڵ�
				DefaultMutableTreeNode selectedNode
					= (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				//����ڵ�Ϊ�գ�ֱ�ӷ���
				if (selectedNode == null) return;
				//����һ���½ڵ�
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("�½ڵ�");
				//ֱ��ͨ��model������½ڵ㣬������ͨ������JTree��updateUI����
				//model.insertNodeInto(newNode, selectedNode, selectedNode.getChildCount());
				//ֱ��ͨ���ڵ�����½ڵ㣬����Ҫ����tree��updateUI����
				selectedNode.add(newNode);
				//--------�������ʵ����ʾ�½ڵ㣨�Զ�չ�����ڵ㣩-------
				TreeNode[] nodes = model.getPathToRoot(newNode);
				TreePath path = new TreePath(nodes);
				tree.scrollPathToVisible(path);
				tree.updateUI();
			}
		});
		panel.add(addChildButton);

		deleteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				DefaultMutableTreeNode selectedNode
					= (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
				if (selectedNode != null && selectedNode.getParent() != null)
				{
					//ɾ��ָ���ڵ�
					model.removeNodeFromParent(selectedNode);
				}
			}
		});
		panel.add(deleteButton);

		editButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				TreePath selectedPath = tree.getSelectionPath();
				if (selectedPath != null)
				{
					//�༭ѡ�нڵ�
					tree.startEditingAtPath(selectedPath);
				}
			}
		});
		panel.add(editButton);

		jf.add(new JScrollPane(tree));
		jf.add(panel , BorderLayout.SOUTH);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

    public static void main(String[] args) 
    {
        new EditJTree().init();
    }
}
