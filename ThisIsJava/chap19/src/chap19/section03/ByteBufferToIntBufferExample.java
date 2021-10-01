package chap19.section03;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ByteBufferToIntBufferExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int[] - > IntBuffer -> ByteBuffer
		int[] writeData = { 10, 20 };
		IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
		ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity() * 4);
		for (int i = 0; i < writeIntBuffer.capacity(); i++) {
			writeByteBuffer.putInt(writeIntBuffer.get(i));
		}
		writeByteBuffer.flip();
		
		//ByteBuffer -> IntBuffer -> int[]
		ByteBuffer readByteBuffer = writeByteBuffer;
		IntBuffer readIntBuffer = readByteBuffer.asIntBuffer();
		int[] readData = new int[readIntBuffer.capacity()];
		readIntBuffer.get(readData);
		System.out.println("�迭 ����: " + Arrays.toString(readData));
	}

}
