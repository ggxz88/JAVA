package chap13.example;

public class ContainerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> container1 = new Container<String>();
		container1.set("ȫ�浿");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}

}
