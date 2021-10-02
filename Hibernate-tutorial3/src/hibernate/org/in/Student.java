package hibernate.org.in;





@Entity
@Table(name="student")
public class Student {

	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NAME")
	private String name;
	
}
