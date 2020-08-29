package chap08.sec02;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	//vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;	//Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ
			bus.checkFare();			//Bus Ÿ������ ���� Ÿ�� ��ȯ�� �ϴ� ����
		}
		
		vehicle.run();
	}
}
