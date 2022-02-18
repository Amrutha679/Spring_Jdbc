package com.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    public StudentDao studentDao;

	@Transactional
	public void insert(Student student) {
		this.studentDao.insert(student);
		
	}

	@Transactional
	public void delete(int id) {
		this.studentDao.delete(id);
		
	}

	@Transactional
	public List<Student> list() {
		
		return this.studentDao.list();
	}

	@Transactional
	public void update(Student student) {
		this.studentDao.update(student);
	}

}
