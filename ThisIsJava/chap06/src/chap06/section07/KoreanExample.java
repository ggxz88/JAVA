package chap06.section07;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "961225-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k3.ssn : " + k2.ssn);
	}

}
