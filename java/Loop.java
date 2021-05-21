package com.dinfree.java.part1;

public class Loop {

	public static void main(String[] args) {
		int power = 13;//
		String members[] = {"홍길동", "김길동", "김사랑", "아무개"};
		
		//구구단
		for(int dan=2; dan<=9; dan++) {
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",dan, i, dan*i);
			}
		}
		/*for(int i = 1; i<=9; i++) {
			System.out.printf("2 * %d = %d\n", i, 2*i);
		}//특정 단 수 하나를 처리 
		System.out.println("------------");

		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("------------");

		for(int i = 0; i<members.length; i++) {
			System.out.println(members[i]);
		}
		
		System.out.println("------------");
		
		for(String name : members) { //members의 데이터에서 하나씩 name으로 전달
			System.out.println(name);
		}
		
		System.out.println("------------");

		while(power > 10) {
			System.out.println("go");
			power--;
		}
		System.out.println("stop");
		System.out.println("------------");
		*/
	}
	

}
