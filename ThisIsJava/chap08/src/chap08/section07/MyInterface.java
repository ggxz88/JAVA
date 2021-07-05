package chap08.section07;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyClassA-method2() ½ÇÇà");
	}
}
