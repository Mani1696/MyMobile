package com.example.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepo extends JpaRepository<StudentDetails,Integer> {

	

}
