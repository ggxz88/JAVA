package chap14.section03;

public class MyFuntionalInterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(2);
		
		fi = x -> {
			System.out.println(x * 5);
		};
		fi.method(2);
	}

}
