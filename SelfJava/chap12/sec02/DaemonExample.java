package chap12.sec02;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //AutoSaveThread�� ���� ������� ����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("���� ������ ����");
	}

}
