package com.tnsif.spring_coreproject_1;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name ="vasan"; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 
	public void showStudent(){
		System.out.println("String=name:"+name);
	}
	
	
}
