

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
		Person p = new Person();
		//��Ϊage�����ѱ����أ�����������佫���ֱ������
		//p.age = 1000;
		//���������벻����ִ��󣬵�����ʱ����ʾ�����age���Բ��Ϸ�
		//���򲻻��޸�p��age����
		p.setAge(1000);
		//����p��age����Ҳ����ͨ�����Ӧ��getter����
		//��Ϊ�����δ�ɹ�����p��age���ԣ��ʴ˴����0
		System.out.println("δ������age����ʱ��" + p.getAge());
		//�ɹ��޸�p��age����
		p.setAge(30);
		//��Ϊ����ɹ�������p��age���ԣ��ʴ˴����30
		System.out.println("�ɹ�����age���Ժ�" + p.getAge());
		//����ֱ�Ӳ���p��name���ԣ�ֻ��ͨ�����Ӧ��setter����
		//��Ϊ"���"�ַ�����������2~6,���Կ��Գɹ�����
		p.setName("���");
		System.out.println("�ɹ�����name���Ժ�" + p.getName());
	}
}
