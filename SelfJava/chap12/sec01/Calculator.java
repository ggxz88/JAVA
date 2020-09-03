package chap12.sec01;

public class Calculator {
	private int memory;
	
	public int getMemoty() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//���� �޸𸮿� ���� �����ϴ� �޼ҵ�, �Ӱ� ����
		this.memory = memory; //�Ű����� memory�ʵ忡 ����
		// �����带 2�ʰ� �Ͻ� ������Ŵ
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}


