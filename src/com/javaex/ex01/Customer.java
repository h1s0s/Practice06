package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNo;
	private int point;
	//생성자
	
	public Customer() {
		super();
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	//메소드 g-s
	
	//메소드 일반
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp+", #고객번호:"+cNo+", #포인트점수:"+point);
	
	}
}
