package com.mindtree.College.VO;

public class Student {
	 
	private String name;
 
	private String gender;
	private int age;
	private String stream;
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	public Student(String name,String gender, int age, String stream) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.stream = stream;
	}
	public Student() {
		super();
	}
}
