package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열 생성
		User[] uArray = new User[3];
		
		//객체 생성
		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		uArray[0] = u01;
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		uArray[1] = u02;
		User u03 = new Employee("master", "m7788", "운영자", 500000);
		uArray[2] = u03;
		
		//반복문으로 showInfo()
		for(int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		System.out.println("운영자의 월급은 "+((Employee)u03).getSalary()+"원 입니다");
	}

}
