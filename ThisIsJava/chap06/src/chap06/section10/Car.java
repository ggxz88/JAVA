package chap06.section10;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
//		int speed = 60;
//		run(); //������ ����
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
