package chap12.sec01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit =  Toolkit.getDefaultToolkit();	//Toolkit객체 얻기
				for(int i=0; i<5; i++) {
					toolkit.beep();	//비프음 발생
					try {
						Thread.sleep(500);	//0.5초간 일시정지
					} catch(Exception e) {
						
					}
				}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
