package com.sp.autowire;

public class Addres {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Addres(String address) {
		super();
		this.address = address;
	}

	public Addres() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Addres [address=" + address + "]";
	}
}
