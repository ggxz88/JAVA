package chap12.sec01;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB"); //������ �̸� ����
	}
	
	public void run() {
		//ThreadB ���� ����
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����"); //������ �̸� ���
		}
	}
}
