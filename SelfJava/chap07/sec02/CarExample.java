package chap07.sec02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("¾Õ¿ÞÂÊ HankookTire·Î ±³Ã¼");
					car.frontLeftTire = new HankookTire("¾Õ¿ÞÂÊ", 15);
					break;
				case 2:
					System.out.println("¾Õ¿ÞÂÊ KumhoTire·Î ±³Ã¼");
					car.frontRightTire = new KumhoTire("¾Õ¿À¸¥ÂÊ", 13);
					break;
				case 3:
					System.out.println("¾Õ¿ÞÂÊ HankookTire·Î ±³Ã¼");
					car.backLeftTire = new HankookTire("µÞ¿ÞÂÊ", 14);
					break;
				case 4:
					System.out.println("¾Õ¿ÞÂÊ KumhoTire·Î ±³Ã¼");
					car.backRightTire = new KumhoTire("µÞ¿À¸¥ÂÊ", 17);
					break;
			}
			System.out.println("---------------------------------");
		}
	}

}
