package chap12.sec02;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit =  Toolkit.getDefaultToolkit();	//Toolkit��ü ���
		for(int i=0; i<10; i++) {
			toolkit.beep();	//������ �߻�
			try {
				Thread.sleep(3000);	//0.5�ʰ� �Ͻ�����
			} catch(InterruptedException e) {
				
			}
		}
	}

}
