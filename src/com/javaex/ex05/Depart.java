package com.javaex.ex05;

public class Depart extends Employee {

	 //필드
	private String work;
	
	//생성자
	public Depart() {
	}
	public Depart(String name, int salary, String work) {
		super(name, salary);
		this.work = work;
	}
	//메소드 g-s
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	//메소드 일반
	public void showInformation() {
		System.out.println("이름:"+getName()+" 연봉:"+ getSalary() + " 부서:"+work);
	}
}
