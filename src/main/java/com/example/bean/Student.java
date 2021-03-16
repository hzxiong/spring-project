package com.example.bean;

import java.io.Serializable;

public class Student implements Serializable {

	private String name = "Eric";
	private String age = "18";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}