package com.spring.jdbc;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
	
	void insert(Student student);
	void delete(int id);
	public List<Student> list();
	void update(Student student);

}
