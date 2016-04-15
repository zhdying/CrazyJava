import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
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
public class AudioPlayer extends JApplet
{
	//����һ����Ƶ����
	AudioClip audioClip;
	JList audioList;
	//����������ť
	JButton buttonPlay;
	JButton buttonLoop;
	JButton buttonStop;

	public void init()
	{
		java.util.ArrayList<String> musicList = new java.util.ArrayList<String>();
		int i = 1;
		//����ѭ�����ظ�Applet�����в���
		while(true)
		{	
			String musicName = getParameter(i++ + "");
			if (musicName == null)
			{
				break;
			}
			else
			{
				musicList.add(musicName);
			}
		}
		String[] musicNames = new String[musicList.size()];
		musicNames = musicList.toArray(musicNames);
		audioList = new JList(musicNames);
		//Ĭ�ϼ��ص�һ������
		audioClip = getAudioClip(getCodeBase() , "music/" + musicNames[0] + ".mid");
		buttonPlay = new JButton("��ʼ����");
		buttonLoop = new JButton("ѭ������");
		buttonStop = new JButton("ֹͣ����");
		//Ϊ������ť��audioList����¼�������
		buttonPlay.addActionListener(new PlayListener());
		buttonLoop.addActionListener(new PlayListener());
		buttonStop.addActionListener(new PlayListener());
		audioList.addMouseListener(new ChangeMusicListener());
		audioList.setPreferredSize(new Dimension(240 , 400));
		add(new JScrollPane(audioList));
		JPanel jp = new JPanel();
		jp.add(buttonPlay);
		jp.add(buttonLoop);
		jp.add(buttonStop);
		add(jp , BorderLayout.SOUTH);
	}
	//��������������ť�ļ�����
	class PlayListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//���ݰ�ť����������Ƶ�ļ����š���ͣ��ѭ������
			if (e.getSource() == buttonPlay)
			{
				if (audioClip != null)
				{
					audioClip.stop();
				}
				audioClip = getSelectedAudioClip();
				audioClip.play();
			}
			else if(e.getSource() == buttonLoop)
			{
				if (audioClip != null)
				{
					audioClip.stop();
				}
				audioClip = getSelectedAudioClip();
				audioClip.loop();
			}
			else if (e.getSource() == buttonStop)
			{
				audioClip.stop();
			}
		}
	}
	//ʵ��JList�ϵ���궯��������
	class ChangeMusicListener extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			if (e.getClickCount() >= 2)
			{
				if (audioClip != null)
				{
					audioClip.stop();
				}
				audioClip = getSelectedAudioClip();
				audioClip.play();
			}
		}
	}
	//����JList�е�ǰѡ�����Ӧ����Ƶ����
	private AudioClip getSelectedAudioClip()
	{
		String selected = audioList.getSelectedValue().toString();
		//�����Ե�ǰѡ���������Ƶ����
		return getAudioClip(getCodeBase() , "music/"
			+ selected + ".mid");
	}
}
