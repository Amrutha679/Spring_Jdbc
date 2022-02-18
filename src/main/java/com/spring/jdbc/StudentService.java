package com.spring.jdbc;

import java.util.List;

public interface StudentService {

	void insert(Student student);
	void delete(int id);
	public List<Student> list();
	void update(Student student);
}
