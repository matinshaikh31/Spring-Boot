package com.sp.setter;

public class student {
  private String sname;
  private int sid;

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

@Override
public String toString() {
	return "student [sname=" + sname + ", sid=" + sid + "]";
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}
}
