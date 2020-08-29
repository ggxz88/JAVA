package chap08.sec02;

public class ImplementationC implements InterfaceC {
	//InterfaceA와 InterfaceB의 실체 메소드도 있어야함
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}
