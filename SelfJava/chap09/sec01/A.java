package chap09.sec01;

/** �ٱ� Ŭ���� **/
class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	
	/**�ν��Ͻ� ��� Ŭ����**/
	class B {
		B() {  //������
			System.out.println("B ��ü�� ������");
		}
		int field1; //�ν��Ͻ� �ʵ�
		//static int field2; //���� �ʵ�(x)
		void method1() { //�ν��Ͻ� �޼ҵ�
			
		}
		//static void method2() { //���� �޼ҵ�(x)
		
		//}
	}
	
	/**���� ��� Ŭ����**/
	static class C {
		C() {  //������
			System.out.println("C ��ü�� ������");
		}
		int field1; //�ν��Ͻ� �ʵ�
		static int field2; //���� �ʵ�
		void method1() { //�ν��Ͻ� �޼ҵ�
			
		}
		static void method2() { //���� �޼ҵ�
		
		}
		
	}
	
	void method() {
		/**���� Ŭ����**/
		class D {
			D() { //������
				System.out.println("D ��ü�� ������");
			}
			int field1; //�ν��Ͻ� �ʵ�
			//static int field2; //���� �ʵ�(x)
			void method1() { //�ν��Ͻ� �޼ҵ�
				
			}
			//static void method2() { //���� �޼ҵ�(x)
			
			//}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
