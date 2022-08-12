package com.mindtree.Student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private double salary;
	private String gender;
	private int age;
	private long coll_id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getColl_id() {
		return coll_id;
	}
	public void setColl_id(long coll_id) {
		this.coll_id = coll_id;
	}
	
	public Student(String name, double salary, String gender, int age, long coll_id) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
		this.coll_id = coll_id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", age=" + age
				+ ", coll_id=" + coll_id + "]";
	}
}
