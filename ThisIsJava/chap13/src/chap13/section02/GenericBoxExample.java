package chap13.section02;

public class GenericBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericBox<String> box1 = new GenericBox<String>();
		box1.set("hello");
		String str = box1.get();
		
		GenericBox<Integer> box2 = new GenericBox<Integer>();
		box2.set(6);
		int value = box2.get();
	}

}
