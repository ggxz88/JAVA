package chap12.section06;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}

}
