package chap06.sec04;

public class CarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
