package com.example.config;

import com.example.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestCofig {
	public TestCofig() {
		System.out.println("spring容器启动初始化。。");
	}

	@Bean
	@Scope("prototype")
	public Student testCreate() {
		return new Student();
	}
}