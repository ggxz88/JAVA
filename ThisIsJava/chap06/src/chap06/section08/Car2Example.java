package chap06.section08;

public class Car2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}

}
