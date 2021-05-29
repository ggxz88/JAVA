package chap04.exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			int deposit = 0;
			int withdrawal = 0;
			
			switch(choice) {
				case 1:
					System.out.print("예금액> ");
					deposit = Integer.parseInt(scanner.nextLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("출금액> ");
					withdrawal = Integer.parseInt(scanner.nextLine());
					balance -= withdrawal;
					break;
				case 3:
					System.out.print("잔고> " + balance);
					break;
				case 4:
					run = false;
					break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
