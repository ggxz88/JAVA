package chap07.sec03;

public class HttpServletExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServlet()); 		// �α��� �մϴ�.
		method(new FileDownloadServlet()); 	// ���� �ٿ�ε� �մϴ�.

	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
