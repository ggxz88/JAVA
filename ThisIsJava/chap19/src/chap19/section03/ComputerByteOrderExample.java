package chap19.section03;

import java.nio.ByteOrder;

public class ComputerByteOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ü�� ����: " + System.getProperty("os.name"));
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ����: " + ByteOrder.nativeOrder());
	}

}
