package chap04.section02;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ��");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ��");
				break;
			default:
				System.out.println("�մ�");
		}
	}

}
