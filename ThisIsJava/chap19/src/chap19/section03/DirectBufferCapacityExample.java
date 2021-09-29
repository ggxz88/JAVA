package chap19.section03;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
		System.out.println("����뷮: " + byteBuffer.capacity() + " ����Ʈ");
		
		CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
		System.out.println("����뷮: " + charBuffer.capacity() + " ����Ʈ");
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		System.out.println("����뷮: " + intBuffer.capacity() + " ����Ʈ");
	}

}
