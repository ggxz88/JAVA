package chap13.section05;

public class BoundTypeParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = Util.compare("a", "b"); // String 타입이라 
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //double -> Double (자동 Boxing)
		System.out.println(result2);
	}

}
