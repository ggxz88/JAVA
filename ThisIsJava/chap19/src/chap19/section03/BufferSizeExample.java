package chap19.section03;

import java.nio.ByteBuffer;

public class BufferSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);
		System.out.println("���̷�Ʈ ���۰� �����Ǿ����ϴ�.");
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200 * 1024 * 1024);
		System.out.println("�ʹ��̷�Ʈ ���۰� �����Ǿ����ϴ�.");
	}

}
