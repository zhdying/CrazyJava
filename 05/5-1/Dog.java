

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Dog
{
	//����һ��jump����
	public void jump()
	{
		System.out.println("����ִ��jump����");
	}
	//����һ��run������run������Ҫ����jump����
	public void run()
	{
		Dog d = new Dog();
		d.jump();
		this.jump();
		System.out.println("����ִ��run����");
	}
}

