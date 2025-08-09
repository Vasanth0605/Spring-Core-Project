package com.tnsif.spring_coreproject_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class College {
	private  Student student;
	//object create does not defined
@Autowired
	public College(Student student) {
		this.student = student;
	}
	public void showCollegeDetails() {
		System.out.println("Welcome to College");
		student.showStudent();
	}

	
}
