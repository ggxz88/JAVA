package chap08.sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 변수에 구현 객체 대입
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}

}
