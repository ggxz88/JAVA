package chap09.sec01;

public class A2 {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	class B {
		void method() {
			//��� �ʵ�� �޼ҵ忡 ������ �� ����
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			//�ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����
			field2 = 10;
			method2();
		}
	}
}
