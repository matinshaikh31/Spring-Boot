package com.sp.CI;

public class Student {
  private String sname;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String sname) {
	super();
	this.sname = sname;
}

@Override
public String toString() {
	return "Student [sname=" + sname + "]";
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}
}
