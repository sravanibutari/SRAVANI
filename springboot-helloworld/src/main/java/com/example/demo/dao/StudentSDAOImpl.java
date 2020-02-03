package com.example.demo.dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
@Transactional
public class StudentSDAOImpl implements StudentDAO {
@Autowired
private EntityManager entityManager;
	@Override
	public Student createStudent(Student student) {
		Session session=entityManager.unwrap(Session.class);
		student.setuId(UUID.randomUUID().toString());
		session.save(student);
		return student;
	}

}
