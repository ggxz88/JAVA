package chap12.sec01;

public class Calculator {
	private int memory;
	
	public int getMemoty() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//계산기 메모리에 값을 저장하는 메소드, 임계 영역
		this.memory = memory; //매개값을 memory필드에 저장
		// 스레드를 2초간 일시 정지시킴
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}


