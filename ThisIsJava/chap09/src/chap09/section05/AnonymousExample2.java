package chap09.section05;

public class AnonymousExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 anony = new Anonymous2();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü �Ű��� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("smartTV�� �մϴ�.");
				}
				@Override
				public void turnOff() {
					System.out.println("smartTV�� ���ϴ�.");
				}
			}
		);
	}

}
