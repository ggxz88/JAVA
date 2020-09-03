package chap12.sec02;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit =  Toolkit.getDefaultToolkit();	//Toolkit객체 얻기
		for(int i=0; i<10; i++) {
			toolkit.beep();	//비프음 발생
			try {
				Thread.sleep(3000);	//0.5초간 일시정지
			} catch(InterruptedException e) {
				
			}
		}
	}

}
