package chap12.sec01;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB"); //스레드 이름 설정
	}
	
	public void run() {
		//ThreadB 실행 내용
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용"); //스레드 이름 얻기
		}
	}
}
