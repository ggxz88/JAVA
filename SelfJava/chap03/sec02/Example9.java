package chap03.sec02;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ��° ��: ");
		String strNum1 = scanner.nextLine();
		
		System.out.println("�� ��° ��: ");
		String strNum2 = scanner.nextLine();
		
		if (strNum2.equals("0.0") || strNum2.equals("0")) {
			System.out.println("��� : ���Ѵ�");
		} 
		else {
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			double result = (double) num1 / num2;
			
			System.out.println("��� : " + result);
		}
		
		
	}

}
