package chap11.section07;

public class StringIndexOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}
	}

}