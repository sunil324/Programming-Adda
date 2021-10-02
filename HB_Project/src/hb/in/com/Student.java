package hb.in.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String Name;
	
	@Column(name="password")
	String Password;
	
	public Student() {
		
	}

	public Student(String name, String password) {
		super();
		Name = name;
		Password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Password=" + Password + "]";
	}
	

}
