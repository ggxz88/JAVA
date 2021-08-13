package chap14.section04;

import chap14.section03.MyFunctionalInterface;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n"); // �ٱ� ��ü�� ������ ��� ���ؼ���  Ŭ������.this�� ���
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n"); // ���ٽ� ���ο��� this�� Inner ��ü�� ����
			};
			fi.method();
		}
	}
}