package com.dinfree.java.part1;

public class Methods {
	String name;
	
	//생성자
	Methods() {//생성자메소드는 리턴 타입 x 쿨래스 이름과 동일한 이름! 인자 생성 가능
		//초기화 작업 수행 
		name = "홍길동";
		System.out.printf("#생성자: %s\n", name);
	}
	
	void printName() {
		System.out.printf("#printName() : %s\n", name);
	}
	
	void printName(String name) {//같은 이름의 메소드를 둘 수 있음 인자가 다르고 리턴타입이 달라야함:method overloading
		System.out.printf("#printName() : %s\n", name);
	}
	
	void printName(String...name) { //... : 가변인자
		System.out.println("#printName(String...name)" );
		for(String s : name) {
			System.out.println(s);
		}
	}
	
	int calc(int num1, int num2) {
		return num1+num2;
		
	}
	public static void main(String[] args) {
		Methods m = new Methods();
		m.printName();
		m.printName("김길동");
		m.printName("아무개","홍길동","김사랑");
		System.out.printf("#calc(int num1, int num2) : %d", m.calc(20, 50));//tab을 치면 다음 인자로!
		//int result = m.calc(20, 50) 
		//System.out.printf("#calc(int num1, int num2) : %d", result);//변수를 하나 더 사용해야 함, 재활용이 돤다면 ㄱㅊ
	}

}
