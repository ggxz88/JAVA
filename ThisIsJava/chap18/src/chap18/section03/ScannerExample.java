package chap18.section03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�> ");
		String inputString = scanner.nextLine();
		System.out.println();
		
		System.out.print("���� �Է�> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("�Ǽ� �Է�> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
	}

}
