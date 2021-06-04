package chap06.section07;

public class Car3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car1 = new Car3();
		System.out.println(car1.company); // 현대자동차
		System.out.println();
		
		Car3 car2 = new Car3("자가용");
		System.out.println(car2.company); // 현대자동차
		System.out.println(car2.model); // 자가용
		System.out.println();
		
		Car3 car3 = new Car3("자가용", "빨강");
		System.out.println(car3.company); // 현대자동차
		System.out.println(car3.model); // 자가용
		System.out.println(car3.color); // 빨강
		System.out.println();
		
		Car3 car4 = new Car3("택시", "검정", 200);
		System.out.println(car4.company); // 현대자동차
		System.out.println(car4.model); // 택시
		System.out.println(car4.color); // 검정
		System.out.println(car4.maxSpeed); // 200 
	}	

}
