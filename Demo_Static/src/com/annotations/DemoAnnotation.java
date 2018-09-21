package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DemoAnnotation {
	
	@MyAnnotation(value1=10, name = "My demo")
	public static void display()
	{
		System.out.println("using my annotation");
		//System.out.println(MyAnnotation.value1());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoAnnotation test = new DemoAnnotation();
		Class class1 = test.getClass();
		Method[] methods = class1.getMethods();
		
		for(Method method: methods) {
			Annotation[] annotations =method.getAnnotations();
			for(Annotation anno : annotations) {
				if(anno.annotationType().equals(MyAnnotation.class))
				{
					MyAnnotation m =(MyAnnotation)anno;
					int value = m.value1();
					String name=m.name();
					System.out.println(value+"\t"+name);
				}
			}
		}
     display()   ;
	}

}
