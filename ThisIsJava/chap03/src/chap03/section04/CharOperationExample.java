package chap03.section04;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;	//컴파일 에러 : 값이 int라서 char에 대입 불가
		System.out.println(c1);	//B
		System.out.println(c2);	//A
		//System.out.println(c3);	
	}	

}
