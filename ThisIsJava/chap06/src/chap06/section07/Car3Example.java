package chap06.section07;

public class Car3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car1 = new Car3();
		System.out.println(car1.company); // �����ڵ���
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���");
		System.out.println(car2.company); // �����ڵ���
		System.out.println(car2.model); // �ڰ���
		System.out.println();
		
		Car3 car3 = new Car3("�ڰ���", "����");
		System.out.println(car3.company); // �����ڵ���
		System.out.println(car3.model); // �ڰ���
		System.out.println(car3.color); // ����
		System.out.println();
		
		Car3 car4 = new Car3("�ý�", "����", 200);
		System.out.println(car4.company); // �����ڵ���
		System.out.println(car4.model); // �ý�
		System.out.println(car4.color); // ����
		System.out.println(car4.maxSpeed); // 200 
	}	

}
