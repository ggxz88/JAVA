package chap09.sec02;

public class AnonymousExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous1 anony = new Anonymous1();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
			//�Ű���
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV�� �մϴ�.");
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV�� ���ϴ�.");
				}
			}
		);
	}
}
