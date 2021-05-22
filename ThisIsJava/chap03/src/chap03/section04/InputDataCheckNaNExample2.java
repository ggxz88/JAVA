package chap03.section04;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리 불가");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);	//NaN이 입력되어 처리 불가
											//10000.0
	}

}
