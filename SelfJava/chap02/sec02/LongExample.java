package chap02.sec02;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000; //컴파일 에러(int 타입의 허용 범위를 초과할 경우, long타입임을 컴파일러에게 알려주어야 함)
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
