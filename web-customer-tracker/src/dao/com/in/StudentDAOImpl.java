package dao.com.in;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.org.in.Student;
@Repository
public class StudentDAOImpl implements StudentDAO {

	
	@Autowired
private SessionFactory sessionFactory;	
	
	
	
	
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Student>query=currentSession.createQuery("from Student",Student.class);
		
		List<Student>students=query.getResultList();
		
		
		
		
		
		
		return students;
	}

}
