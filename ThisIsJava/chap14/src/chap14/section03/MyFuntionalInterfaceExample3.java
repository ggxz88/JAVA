package chap14.section03;

public class MyFuntionalInterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface3 fi;
		
		fi = (x, y) -> {
			int result = x * 5;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}
