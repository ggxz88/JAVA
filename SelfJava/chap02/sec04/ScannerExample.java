package chap02.sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;
			}
		}
		
		System.out.println("����");
	}

}
