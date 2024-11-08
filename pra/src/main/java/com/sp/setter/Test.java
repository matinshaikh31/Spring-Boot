package com.sp.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static ApplicationContext context ;
  public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/sp/setter/config.xml");
	student s1 =(student) context.getBean("st") ;
	System.out.println(s1);
}
}
