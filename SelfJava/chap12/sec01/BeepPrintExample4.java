package chap12.sec01;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new BeepThread();
		thread.start();	//BeepThread.java
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
