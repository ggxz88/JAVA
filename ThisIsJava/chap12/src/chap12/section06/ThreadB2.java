package chap12.section06;

public class ThreadB2 extends Thread {
	private WorkObject workObject;
	
	public ThreadB2(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
