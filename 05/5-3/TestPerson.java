

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestPerson
{
	public static void main(String[] args) 
	{
		//Person���Ѿ����أ���eyeNum�����������ˣ����0
		System.out.println("Person��eyeNum������ֵ:" + Person.eyeNum);
		//����Person����
		Person p = new Person();
		//ͨ��Person���������p������Person����nameʵ������
		//��ͨ��ʵ������eyeNum������
		System.out.println("p������name����ֵ�ǣ�" + p.name 
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		//ֱ��Ϊnameʵ�����Ը�ֵ
		p.name = "�����";
		//ͨ��p����eyeNum�����ԣ���Ȼ�Ƿ���Person��eyeNum����
		p.eyeNum = 2;
		//�ٴ�ͨ��Person����������nameʵ�����Ժ�eyeNum������
		System.out.println("p������name����ֵ�ǣ�" + p.name 
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		//ǰ��ͨ��p�޸���Person��eyeNum���ԣ��˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum������ֵ:" + Person.eyeNum);
		Person p2 = new Person();
		//p2���ʵ�eyeNum��������Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum������ֵ:" + p2.eyeNum);
	}
}
