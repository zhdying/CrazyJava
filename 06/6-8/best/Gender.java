
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public enum Gender 
{
	//�˴���ö��ֵ������ö�Ӧ������������
	MALE("��"),FEMALE("Ů");
	private String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}
}