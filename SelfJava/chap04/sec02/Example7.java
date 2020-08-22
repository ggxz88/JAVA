package chap04.sec02;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
				case 1:
					System.out.print("예금액> ");
					int deposit = Integer.parseInt(scanner.nextLine());
					
					balance += deposit;
					
					break;
				case 2:
					System.out.print("출금액> ");
					int withdraw = Integer.parseInt(scanner.nextLine());
					
					balance -= withdraw;
					
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("다시 입력해 주세요");
			}
						
		}
		System.out.println("프로그램 종료");

	}
}
