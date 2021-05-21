package com.dinfree.java.part1;

public class Operator1 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 14;
		
		int result1 = num1 * num2;
		int result2 = num1 % num2; // % :나머지를 구해주는 연산
		
		System.out.printf("result1 : %d \n", result1);
		System.out.printf("result2 : %d \n", result2);
		System.out.println("-------------------------"); //\n내장		
		/*for(int i=1;i<num1;i++) {
			System.out.printf("%d\t", i);
			if(i % 3 == 0) {
				System.out.println();
			}
		}*/
		
		num1++; // ++뒤 : 이 문장을 수행한 다음라인에서 증가
		//앞 : 먼저 증가하고 문장 수행
		num2 *= 2; //:단항연산 num2 = num2 * 2
		System.out.printf("num1++ : %d \n", num1);
		System.out.printf("num2 *= 2 : %d \n", num2);
		System.out.println("-------------------------");		

		System.out.printf("num1++ : %d \n", num1++);
		System.out.printf("--num1 : %d \n", --num1);
	}

}
