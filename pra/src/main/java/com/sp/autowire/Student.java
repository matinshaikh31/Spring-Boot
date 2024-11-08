package com.sp.autowire;

public class Student {
   private String sname;

   private Addres adress;

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public Addres getAdress() {
	return adress;
}

public void setAdress(Addres adress) {
	this.adress = adress;
}

public Student(String sname, Addres adress) {
	super();
	this.sname = sname;
	this.adress = adress;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [sname=" + sname + ", adress=" + adress + "]";
}

}
