package chap09.example;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String nickName2 = chatId;
					String inpuData = "�ȳ��ϼ���";
					//String message = "[" + nickName + "] " + inpuData;
					String message = "[" + nickName2 + "] " + inpuData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {
			
		}
		void sendMessage(String message) {
			
		}
	}
}
