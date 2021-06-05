package chap06.section08;

public class Calculator {

	void powerOn() {
		System.out.println("Àü¿øÀ» ÄÕ´Ï´Ù.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("Àü¿øÀÄ ²ü´Ï´Ù.");
	}

}
