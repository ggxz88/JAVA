package chap07.sec02;

public class InstanceofExample {
	
	public static void method1(Parent2 parent) {
		if(parent instanceof Child2) { //Child Ÿ������ ��ȯ�� �������� Ȯ��
			Child2 child = (Child2) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent2 parent) {
		Child2 child = (Child2) parent; //classcastException�� �߻��� ���ɼ� ����
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 parentA = new Child2();
		//Child ��ü�� �Ű������� ����
		method1(parentA);
		method2(parentA);
		
		Parent2 parentB = new Parent2();
		//Parent ��ü�� �Ű������� ����
		method1(parentB);
		//method2(parentB); //���� �߻�
	}

}
