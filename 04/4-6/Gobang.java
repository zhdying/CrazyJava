
import java.io.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Gobang
{
	//����һ����ά�������䵱����
	private String[][] board;
	//�������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	public void initBoard()
	{
		//��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��ÿ��Ԫ�ظ�Ϊ"��"�������ڿ���̨��������
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				board[i][j] = "��";
			}
		}
	}
	//�ڿ���̨������̵ķ���
	public void printBoard()
	{
		//��ӡÿ������Ԫ��
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				//��ӡ����Ԫ�غ󲻻���
				System.out.print(board[i][j]);
			}
			//ÿ��ӡ��һ������Ԫ�غ����һ�����з�
			System.out.print("\n");
		}
	}
    public static void main(String[] args)throws Exception
    {
        Gobang gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
		//�������ڻ�ȡ��������ķ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine()��ÿ���ڼ���������һ�����ݰ��س�������������ݽ���br��ȡ����
		while ((inputStr = br.readLine()) != null)
		{
			//���û�������ַ����Զ��ţ�,����Ϊ�ָ������ָ���2���ַ���
			String[] posStrArr = inputStr.split(",");
			//��2���ַ���ת�����û����������
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			//�Ѷ�Ӧ������Ԫ�ظ�Ϊ"��"��
			gb.board[xPos - 1][yPos - 1] = "��";				
			/*
			 �����������2����������Ϊ������������꣬����board���顣
			 ���漰
				1.�������Ч�ԣ�ֻ�������֣����ܳ������̷�Χ
				2.����µ���ĵ㣬�����ظ����塣
				3.ÿ���������Ҫɨ��˭Ӯ��
			 */
			gb.printBoard();
			System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
		}
    }
}
