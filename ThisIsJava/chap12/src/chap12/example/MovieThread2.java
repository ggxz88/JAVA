package chap12.example;

public class MovieThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("동영상을 재생합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
}
