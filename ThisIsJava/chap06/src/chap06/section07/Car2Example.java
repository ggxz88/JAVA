package chap06.section07;

public class Car2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1 = new Car2();
		System.out.println(car1.company); // 현대자동차
		System.out.println();
		
		Car2 car2 = new Car2("자가용");
		System.out.println(car2.company); // 현대자동차
		System.out.println(car2.model); // 자가용
		System.out.println();
		
		Car2 car3 = new Car2("자가용", "빨강");
		System.out.println(car3.company); // 현대자동차
		System.out.println(car3.model); // 자가용
		System.out.println(car3.color); // 빨강
		System.out.println();
		
		Car2 car4 = new Car2("택시", "검정", 200);
		System.out.println(car4.company); // 현대자동차
		System.out.println(car4.model); // 택시
		System.out.println(car4.color); // 검정
		System.out.println(car4.maxSpeed); // 200
	
	}

}
