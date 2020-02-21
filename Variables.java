package com.dinfree.java.part1;

public class Variables {
	// 멤버변수, 인스턴스 변수
	int num1;

	//멤버변수, 클래스 변수
	static int num2;
	
	public void printName(String name) { //String name : 매개변수
		//지역 변수(메소드 블럭 안에 생성된 변수)
		//클래스 변수랑 인스턴스변수랑 독립적
		String prtMsg = name + " Hello";
		System.out.println(prtMsg);
		//int num1 = this.num1; //인스턴스 변수
	}
	
	public static void main(String[] args) {
		Variables mc = new Variables();//인스턴스
		mc.num1 = 100;
		Variables.num2 = 50;
		
		//인자로 매개변수에 값을 전달
		mc.printName("홍길동");
		/*
		 * System.out.println(mc.num1);
		System.out.println(Variables.num2); //static을 사용했을 경우
		//System.out.println(num1);//오류 num1 클래스의 변수이기 때문임 메인 함수의 변수가 아니기 때문
		*/
		System.out.printf("%d, %d", mc.num1, Variables.num2);//printf의 f는 format
	}

}
