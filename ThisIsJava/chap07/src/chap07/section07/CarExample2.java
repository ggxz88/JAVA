package chap07.section07;

public class CarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		
		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire�� ��ü");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("-------------------------------------------");
		}
	}

}
