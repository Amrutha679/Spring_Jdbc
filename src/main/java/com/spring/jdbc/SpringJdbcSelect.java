package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcSelect {
	
//JdbcTemplate jt; 
  
private SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}


public void select() {
	
	Session se = sessionFactory.openSession();
	org.hibernate.Query qr = se.createQuery("from Student s");
	List list = qr.list();
	
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

	
//	public void select() {
//		
//		List list = jt.queryForList("select * from student");
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//	}

}
