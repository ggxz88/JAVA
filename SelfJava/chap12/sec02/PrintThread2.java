package chap12.sec02;

public class PrintThread2 extends Thread {
	public void run() {
		/*
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			
		}
		*/
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");	
	}
}
