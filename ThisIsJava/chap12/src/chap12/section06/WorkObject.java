package chap12.section06;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA2�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB2�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
	} 
}
