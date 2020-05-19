package com.ict.edu3;

public class Employee extends Person{
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		
		
		System.out.println("이름 : " + super.getName() + ", 나이 : " + getAge()+", 부서 : " + dept);
	}
	
	
	
}
