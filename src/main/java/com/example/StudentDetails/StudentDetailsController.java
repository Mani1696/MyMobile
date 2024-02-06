package com.example.StudentDetails;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin("http://localhost:4200/")
@RestController
public class StudentDetailsController {
	@Autowired
	StudentDetailsService ds;
	@GetMapping(value="/Get")
	public String name() {
		return "Name: Sekar";
	}
	
	@PostMapping(value="/postAll")
	String PostAll(@RequestBody List<StudentDetails> a) {
		return ds.PostAll(a);
	}
	
	@GetMapping(value="/GetAll")
	public List<StudentDetails> getAll() {
		return ds.getAll();
	}

}
