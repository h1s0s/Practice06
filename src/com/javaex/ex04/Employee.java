package com.javaex.ex04;

public class Employee extends User {
	//필드
	private int salary;

	//생성자
	public Employee() {
		super();
	}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	//메소드 g-s
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드일반
	public void showInfo() {
		System.out.println("#아이디:"+id+", #패스워드:"+password+", #이름:"+name+", #월급:"+salary);
	}
	
}
