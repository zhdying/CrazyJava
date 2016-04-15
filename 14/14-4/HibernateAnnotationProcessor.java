import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.type.*;
import com.sun.mirror.util.*;

import java.beans.*;
import java.io.*;
import java.util.*;

import java.lang.reflect.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class HibernateAnnotationProcessor implements AnnotationProcessor 
{
	//Annotation�������������Ǹô�������APT��������Ҫ;��
	private AnnotationProcessorEnvironment env;
	//����HibernateAnnotationProcessor����ʱ����ô���������
	public HibernateAnnotationProcessor(AnnotationProcessorEnvironment env) 
	{
		this.env = env;
	}
	//ѭ������ÿ������
	public void process()
	{
		//����ÿ��class�ļ�
		for (TypeDeclaration t : env.getSpecifiedTypeDeclarations())
		{
			//����һ���ļ���������������ɶ�����ļ�
			FileOutputStream fos = null;
			//��ȡ���ڴ��������
			String clazzName = t.getSimpleName();
			//��ȡ�ඨ��ǰ��Persistent Annotation
			Persistent per = t.getAnnotation(Persistent.class);
			//��per Annotation��Ϊ��ʱ�ż�������
			if(per != null)
			{
				try
				{
					//�����ļ������
					fos = new FileOutputStream(clazzName + ".hbm.xml");
					PrintStream ps = new PrintStream(fos);
					//ִ�����
					ps.println("<?xml version=\"1.0\"?>");
					ps.println("<!DOCTYPE hibernate-mapping");
					ps.println("	PUBLIC \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\"");
					ps.println("    \"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd\">");
					ps.println("<hibernate-mapping>");
					ps.print("	<class name=\"" + t);
					//���per��table()��ֵ
					ps.println("\" table=\"" + per.table() + "\">");
					for (FieldDeclaration f : t.getFields())
					{
						//��ȡָ��FieldDeclarationǰ���IdProperty Annotation
						IdProperty id = f.getAnnotation(IdProperty.class);
						//���id Annotation��Ϊ��
						if (id != null)
						{
							//ִ�����
							ps.println("		<id name=\""
								+ f.getSimpleName() 
								+ "\" column=\"" + id.column()
								+ "\" type=\"" + id.type()
								+ "\">");
							ps.println("			<generator class=\"" 
								+ id.generator() + "\"/>");
							ps.println("		</id>");
						}
						//��ȡָ��FieldDeclarationǰ���Property Annotation
						Property p = f.getAnnotation(Property.class);
						//���p Annotation��Ϊ��
						if (p != null)
						{
							//ִ�����
							ps.println("		<property name=\"" 
								+ f.getSimpleName() 
								+ "\" column=\"" + p.column() 
								+ "\" type=\"" + p.type()
								+ "\"/>");		
						}
					}
					ps.println("	</class>");
					ps.println("</hibernate-mapping>");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					//�ر������
					try
					{
						if (fos != null)
						{
							fos.close();
						}
					}
					catch (IOException ex)
					{
						ex.printStackTrace();
					}
				}
			}
		}
	}
}
