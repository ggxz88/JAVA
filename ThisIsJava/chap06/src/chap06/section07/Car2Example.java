package chap06.section07;

public class Car2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1 = new Car2();
		System.out.println(car1.company); // �����ڵ���
		System.out.println();
		
		Car2 car2 = new Car2("�ڰ���");
		System.out.println(car2.company); // �����ڵ���
		System.out.println(car2.model); // �ڰ���
		System.out.println();
		
		Car2 car3 = new Car2("�ڰ���", "����");
		System.out.println(car3.company); // �����ڵ���
		System.out.println(car3.model); // �ڰ���
		System.out.println(car3.color); // ����
		System.out.println();
		
		Car2 car4 = new Car2("�ý�", "����", 200);
		System.out.println(car4.company); // �����ڵ���
		System.out.println(car4.model); // �ý�
		System.out.println(car4.color); // ����
		System.out.println(car4.maxSpeed); // 200
	
	}

}
