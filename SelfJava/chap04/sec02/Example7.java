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
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("--------------------------------");
			
			System.out.print("����> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
				case 1:
					System.out.print("���ݾ�> ");
					int deposit = Integer.parseInt(scanner.nextLine());
					
					balance += deposit;
					
					break;
				case 2:
					System.out.print("��ݾ�> ");
					int withdraw = Integer.parseInt(scanner.nextLine());
					
					balance -= withdraw;
					
					break;
				case 3:
					System.out.println("�ܰ�> " + balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("�ٽ� �Է��� �ּ���");
			}
						
		}
		System.out.println("���α׷� ����");

	}
}
