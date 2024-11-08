package com.sp.standalone;

import java.util.*;

public class Student {
	  private List<String> name;
	  private Set<String> rollNo;
	  private Map<String,String> course;
	  
	  
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getRollNo() {
		return rollNo;
	}
	public void setRollNo(Set<String> rollNo) {
		this.rollNo = rollNo;
	}
	public Map<String,String> getCourse() {
		return course;
	}
	public void setCourse(Map<String,String> course) {
		this.course = course;
	}
  
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student [name="+name+ " ] rno=[" +rollNo +" ] courses= [" + course +"]" ;
	}
	
}
