package chap04.sec02;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
