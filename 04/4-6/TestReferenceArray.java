

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestReferenceArray
{
	public static void main(String[] args) 
	{
		//����һ��students�����������������Person[]
		Person[] students;
		//ִ�ж�̬��ʼ��
		students = new Person[2];
		//����һ��Personʵ�����������Personʵ������zhang����
		Person zhang = new Person();
		//Ϊzhang�����õ�Person��������Ը�ֵ
		zhang.age = 15;
		zhang.height = 158;
		//����һ��Personʵ�����������Personʵ������lee����
		Person lee = new Person();
		//Ϊlee�����õ�Person��������Ը�ֵ
		lee.age = 16;
		lee.height = 161;
		//��zhang������ֵ������һ������Ԫ��
		students[0] = zhang;
		//��lee������ֵ�����ڶ�������Ԫ��
		students[1] = lee;
		//�������д���Ľ����ȫһ������Ϊlee��students[1]ָ�����ͬһ��Personʵ����
		lee.info();
		students[1].info();
	}
}
