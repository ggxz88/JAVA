package chap06.section10;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
//		int speed = 60;
//		run(); //컴파일 에러
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
