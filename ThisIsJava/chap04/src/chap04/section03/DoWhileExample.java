package chap04.section03;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지 입력");
		System.out.println("프로그램 종료: q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
