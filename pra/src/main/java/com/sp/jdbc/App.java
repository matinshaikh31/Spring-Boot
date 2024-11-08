package com.sp.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.jdbc.dao.EmpDao;
import com.sp.jdbc.entities.Employee;

public class App {
  public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("com/sp/jdbc/config.xml");
	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
	Employee c1 = new Employee();
//	c1.setEid(101);
//	c1.setEname("Matin");
//	c1.setDname("Marketing");
//	int r = cd.insert(c1);
	c1.setEid(101);
	c1.setEname("Yash");
    int r = cd.update(c1);
	
	System.out.println("Recorded inserted"+r);
			
}
}
