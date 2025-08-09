package com.tnsif.Spring_example_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {

	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontent.xml");
	  College college = (College) context.getBean("collegebean");
	  college.show();
  }
}