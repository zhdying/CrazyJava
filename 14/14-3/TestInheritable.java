

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
//ʹ��@Inheritable���ε�Base��
@Inheritable
class Base
{
}
//TestInheritable��ֻ�Ǽ̳���Base�࣬
//��δֱ��ʹ��@Inheritable Annotiation����
public class TestInheritable extends Base
{
	public static void main(String[] args)
	{
		//��ӡTestInheritable���Ƿ����Inheritable Annotation
		System.out.println(TestInheritable.class 
			.isAnnotationPresent(Inheritable.class));
	}
}
