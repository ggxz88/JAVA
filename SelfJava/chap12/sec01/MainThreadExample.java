package chap12.sec01;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); //User1 ������ ����
		user1.setCalculator(calculator); //���� ��ü ����
		user1.start(); //User1 ������ ����
		
		User2 user2 = new User2(); //User2 ������ ����
		user2.setCalculator(calculator); //���� ��ü ����
		user2.start(); //User2 ������ ����
		
	}

}
