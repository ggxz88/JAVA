package chap11.section03;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for (int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			
			// counter 객체를 쓰레기로 민듦
			counter = null;
			
			// 쓰레기 수집기 실행 요청
			System.gc();
		}
	}

}
