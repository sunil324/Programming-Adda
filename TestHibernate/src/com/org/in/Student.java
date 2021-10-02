package com.org.in;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String FirstName;
	
	@Column(name="lastname")
	private String LastName;
	
	@Column(name="email")
	private String Email;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
	}
	
	
	
	
	
	

}
