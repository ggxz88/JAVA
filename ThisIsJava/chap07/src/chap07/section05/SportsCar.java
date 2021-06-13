package chap07.section05;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩 불가
//	@Override
//	public void stop() {
//		System.out.println("차를 멈춤");
//		speed = 0;
//	}
}
