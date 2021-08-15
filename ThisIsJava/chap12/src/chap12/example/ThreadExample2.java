package chap12.example;

public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MovieThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		thread.interrupt();
	}

}
