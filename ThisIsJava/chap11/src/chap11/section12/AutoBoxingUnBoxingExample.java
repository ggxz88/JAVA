package chap11.section12;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//���� �� �ڵ� UnBoxing
		int value = obj;
		System.out.println("value :" + value);
		
		//���� �� �ڵ� UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}