package chap12.sec01;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public void run() {
		//스레드 실행 내용
		Toolkit toolkit =  Toolkit.getDefaultToolkit();	//Toolkit객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();	//비프음 발생
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch(Exception e) {
				
			}
		}
	}
}
