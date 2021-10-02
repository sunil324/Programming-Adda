package com.luv2.in;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="unit")

public class Unit {
	
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NAME")
	private String name;

	public Unit() {
		super();
	}

	public Unit(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Unit [password=" + password + ", name=" + name + "]";
	}
	
	
	
	
	
	
	

}
