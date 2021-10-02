package com.org.in;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {

	
	
	@Column(name="firstname")
	private String Firstname;
	
	@Column(name="lastname")
	private String Lastname;
	@Column(name="email")
	private String Email;
	
	@Column(name="address")
	private String Address;

	public Student() {
		super();
	}

	public Student(String firstname, String lastname, String email, String address) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Address = address;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email + ", Address="
				+ Address + "]";
	}
	
	
	
	
	
	
	
	
}
