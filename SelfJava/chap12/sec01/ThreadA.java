package chap12.sec01;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA"); //������ �̸� ����
	}
	
	public void run() {
		//ThreadA ���� ����
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����"); //������ �̸� ���
		}
	}
}
