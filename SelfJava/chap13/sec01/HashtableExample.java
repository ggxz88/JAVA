package chap13.sec01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		
		//���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		//Ű����κ��� �Էµ� ������ �ޱ� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵�: ");
			String id = scanner.nextLine(); //Ű����� �Է��� ���̵� ����
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) { //���̵�� Ű�� �����ϴ� �� Ȯ��
				if(map.get(id).equals(password)) { //��й�ȣ�� ��
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				 System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			
		}
	}

}
