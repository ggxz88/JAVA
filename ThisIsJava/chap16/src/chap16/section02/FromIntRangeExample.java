package chap16.section02;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("รัวี: " + sum);
	}
	
}
