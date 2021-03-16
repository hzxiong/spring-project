package com.example.demo;


import com.example.bean.Student;
import com.example.config.TestCofig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestCofig.class);
		Student student = (Student) applicationContext.getBean("testCreate");
		System.out.println(student.getAge());

	}
}