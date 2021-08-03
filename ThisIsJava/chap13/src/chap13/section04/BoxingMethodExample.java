package chap13.section04;

import chap13.section02.GenericBox;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericBox<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		GenericBox<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
	}

}
