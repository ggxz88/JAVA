package chap12.example;

public class MovieThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("�������� ����մϴ�.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
}
