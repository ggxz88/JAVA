package chap02.sec04;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("KeyCode: " + keyCode);
		}
	}

}
