package com.example.StudentDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table (name="sdtable")
	public class StudentDetails {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String std;
		private int age;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStd() {
			return std;
		}
		public void setStd(String std) {
			this.std = std;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}


	}
