
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.type.*;
import com.sun.mirror.util.*;

import java.beans.*;
import java.io.*;
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
public class HibernateAnnotationFactory implements AnnotationProcessorFactory 
{
	//����֧�ֵ�ע������
	public Collection<String> supportedAnnotationTypes() 
	{
		return Arrays.asList("Property" , "IdProperty" , "Persistent");
	}
	//��������֧�ֵ�ѡ��
	public Collection<String> supportedOptions() 
	{
		return Arrays.asList(new String[0]);
	}
	//����Annotation������
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
		AnnotationProcessorEnvironment env) 
	{
		return new HibernateAnnotationProcessor(env);
	}   
}
