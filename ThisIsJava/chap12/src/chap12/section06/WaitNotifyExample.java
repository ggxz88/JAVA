package chap12.section06;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();
		
		ThreadA2 threadA = new ThreadA2(sharedObject);
		ThreadB2 threadB = new ThreadB2(sharedObject);
		
		threadA.start();
		threadB.start();
	}

}
