package com.org.in;


import java.util.Scanner;

public class Emp {
	int id;
	String name;
	Address address;
	

	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

void display() {
	System.out.println(id+":"+name);
	System.out.println(address.city+":"+address.state+":"+address.country);
}





	public static void main(String[] args) {
		// TODO Auto-generated method 
			
		Address address=new Address("navi mumbai","maharahstra","india");
		
		
		Emp e=new Emp(112,"sunil",address);
		
		
		e.display();
		
		
	}

}
