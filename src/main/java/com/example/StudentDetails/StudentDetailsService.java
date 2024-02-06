package com.example.StudentDetails;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsDao dd;
	
	String PostAll(List<StudentDetails> a) {
		return dd.PostAll(a);
	}
	
	public List<StudentDetails> getAll() {
		return dd.getAll();
	}

}
