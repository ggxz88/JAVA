package chap08.section03;

import chap08.section02.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		// �������̽� ������ ���� ��ü ����
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				
			}
			
			public void turnOff() {
				
			}
			
			public void setVolume(int volume) {
				
			}
		};
	}
}