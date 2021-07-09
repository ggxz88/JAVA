package chap09.section05;

public class AnonymousExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 anony = new Anonymous2();
		//익명 객체 필드 사용
		anony.field.turnOn();
		//익명 객체 매개값 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("smartTV를 켭니다.");
				}
				@Override
				public void turnOff() {
					System.out.println("smartTV를 끕니다.");
				}
			}
		);
	}

}
