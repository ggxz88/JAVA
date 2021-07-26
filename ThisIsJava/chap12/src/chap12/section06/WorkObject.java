package chap12.section06;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA2의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB2의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	} 
}
