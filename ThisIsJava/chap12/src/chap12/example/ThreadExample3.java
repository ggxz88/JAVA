package chap12.example;

public class ThreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MovieThread3();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e)	{
			
		}
		
	}

}