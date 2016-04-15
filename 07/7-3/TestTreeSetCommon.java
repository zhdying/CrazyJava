import java.util.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestTreeSetCommon
{
	public static void main(String[] args) 
	{
		TreeSet nums = new TreeSet();
		//��TreeSet������ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		//�������Ԫ�أ���������Ԫ���Ѿ���������״̬
		System.out.println(nums);
		//���������ĵ�һ��Ԫ��
		System.out.println(nums.first());
		//�������������һ��Ԫ��
		System.out.println(nums.last());
		//����С��4���Ӽ���������4
		System.out.println(nums.headSet(4));
		//���ش���5���Ӽ������Set�а���5���Ӽ��л�����5
		System.out.println(nums.tailSet(5));
		//���ش��ڵ���-3��С��4���Ӽ���
		System.out.println(nums.subSet(-3 , 4));
	}
}
