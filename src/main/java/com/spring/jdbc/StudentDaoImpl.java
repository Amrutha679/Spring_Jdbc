package com.spring.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void insert(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(student);
		
	}

	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Student s = (Student) session.load(Student.class, new Integer(id));
		if(null != s){
			session.delete(s);
		}
		
	}

	public List<Student> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Student>studentList = session.createQuery("from Student").list();
		for(Student s : studentList){
			System.out.println(s.getId()+" "+s.getName()+s.getMarks());
		}
		return studentList;
	}

	public void update(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(student);
		
	}
	
	
	
}
