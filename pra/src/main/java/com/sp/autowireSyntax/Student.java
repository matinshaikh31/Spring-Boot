package com.sp.autowireSyntax;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
  private String sname;
  @Autowired
  private Address address ;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student(String sname, Address address) {
	super();
	this.sname = sname;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", address=" + address + "]";
}
}
