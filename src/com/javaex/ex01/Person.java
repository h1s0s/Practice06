package com.javaex.ex01;

public class Person {
	
	//필드
	protected String name;
	protected String hp;

	
	//생성자
	public Person() {
	}
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
	//메소드 g-s
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp);
	
	}
}