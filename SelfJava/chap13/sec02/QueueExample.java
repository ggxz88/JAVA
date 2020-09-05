package chap13.sec02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaoEmail", "ȫ�α�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
					break;
				case "sendSMS":
					System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
					break;
				case "sendKakaoEmail":
					System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
					break;	
			}
		}

	}
}
