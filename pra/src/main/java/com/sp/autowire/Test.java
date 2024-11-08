package com.sp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static ApplicationContext context ;
   public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/sp/autowire/config.xml");
	Student st = (Student) context.getBean("s1");
	System.out.println(st);
}
}
