package chap09.sec01;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter1 outter = new Outter1();
		Outter1.Nested nested = outter.new Nested();
		nested.print();
	}

}
