package chap07.sec03;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone(); // 추상 클래스는  실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
