package chap09.section03;

public class Outter {
	// 자바 7 이잔
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method1() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVriable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
