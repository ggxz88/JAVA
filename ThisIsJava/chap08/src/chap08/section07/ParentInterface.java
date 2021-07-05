package chap08.section07;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("method2() ½ÇÇà");
	}
}
