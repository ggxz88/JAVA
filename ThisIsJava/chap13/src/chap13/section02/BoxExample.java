package chap13.section02;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("ȫ�浿");					//String -> Object �ڵ� Ÿ�� ��ȯ
		String name = (String) box.get();	//Object -> String ���� Ÿ�� ��ȯ
		
		box.set(new Apple());				//Apple -> Object �ڵ� Ÿ�� ��ȯ
		Apple apple = (Apple) box.get();	//Object -> Apple ���� Ÿ�� ��ȯ
	}

}