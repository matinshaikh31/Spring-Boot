package com.sp.standalone;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static ApplicationContext context;
public static void main(String[] args) {
	
	context = new ClassPathXmlApplicationContext("com/sp/standalone/config.xml");
	Student s1 = (Student) context.getBean("student");
	System.out.println(s1);
	
}
}

