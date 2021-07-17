package chap11.section05;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				//JVM 종료 요청
				System.exit(i);
			} catch(SecurityException e) {
				
			}
		}
	}

}
