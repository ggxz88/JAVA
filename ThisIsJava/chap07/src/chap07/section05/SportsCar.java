package chap07.section05;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//�������̵� �Ұ�
//	@Override
//	public void stop() {
//		System.out.println("���� ����");
//		speed = 0;
//	}
}
