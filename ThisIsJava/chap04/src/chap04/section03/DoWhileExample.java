package chap04.section03;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽��� �Է�");
		System.out.println("���α׷� ����: q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
