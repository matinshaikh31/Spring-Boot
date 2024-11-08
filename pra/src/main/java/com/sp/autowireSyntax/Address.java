package com.sp.autowireSyntax;

public class Address {
   private String address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Address(String address) {
	super();
	this.address = address;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Address [address=" + address + "]";
}


}
