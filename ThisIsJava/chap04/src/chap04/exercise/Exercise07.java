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
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			int deposit = 0;
			int withdrawal = 0;
			
			switch(choice) {
				case 1:
					System.out.print("���ݾ�> ");
					deposit = Integer.parseInt(scanner.nextLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("��ݾ�> ");
					withdrawal = Integer.parseInt(scanner.nextLine());
					balance -= withdrawal;
					break;
				case 3:
					System.out.print("�ܰ�> " + balance);
					break;
				case 4:
					run = false;
					break;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}