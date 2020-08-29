package chap08.sec02;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
