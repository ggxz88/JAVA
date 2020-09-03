package chap12.sec02;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) { // stop이 true가 될 때
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
