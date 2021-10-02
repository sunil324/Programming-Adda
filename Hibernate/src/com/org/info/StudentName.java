package com.org.info;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;


@Table
@Controller
public class StudentName {
	
	@Id
	@Column(name="id")
	int id;
	@Column(name="First-Name")
	String FirstName;
	@Column(name="Last-Name")
	String LastName;
	@Column(name="email")
	String Email;

	public StudentName(String firstName, String lastName, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}

	
	public StudentName() {
		
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
		return "StudentName [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ "]";
	}
	
	
	
	
	
	

}
