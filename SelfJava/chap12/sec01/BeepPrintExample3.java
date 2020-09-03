package chap12.sec01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit =  Toolkit.getDefaultToolkit();	//Toolkit��ü ���
				for(int i=0; i<5; i++) {
					toolkit.beep();	//������ �߻�
					try {
						Thread.sleep(500);	//0.5�ʰ� �Ͻ�����
					} catch(Exception e) {
						
					}
				}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
