package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");//Shape(2) 생성자 사용
		System.out.println("================");
		
		Triangle t1 = new Triangle();//Shape(0) triangle(0) 생성자 사용
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);//Shape(2) triangle(2) 생성자 사용, 컬러 "검정", "검정"
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);//triangle(4) 사용하고, Shape(2)생성자 사용
		System.out.println("================");
		
	}

}

