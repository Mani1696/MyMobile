package com.example.StudentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDetailsDao {
	@Autowired
	StuRepo dr;
	
	String PostAll(List<StudentDetails> a) {
		dr.saveAll(a);
		return "Data saved successfully";
	}
	public List<StudentDetails> getAll() {
		return dr.findAll();
	}

}
