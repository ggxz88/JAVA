package chap13.example;

public class ContainerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("ȫ�浿", "����");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("ȫ�浿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}

}
