package chap19.section03;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[7����Ʈ ũ��� ���� ����]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);		
		
		printState(buffer);									//position:0, limit: 7, capacity:7
		
		//����� ����
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("[2����Ʈ ������]");
		printState(buffer);									//position:2, limit: 7, capacity:7
		
		//����� ����
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3����Ʈ ������]");
		printState(buffer);									//position:5, limit: 7, capacity:7
		
		//�����͸� �б� ���� ��ġ �Ӽ��� ����
		buffer.flip();
		System.out.println("[flip() ���� ��]");
		printState(buffer);									//position:0, limit: 5, capacity:7
		
		//����� �б�
		buffer.get(new byte[3]);
		System.out.println("[3����Ʈ�� ���� ��]");
		printState(buffer);									//position:3, limit: 5, capacity:7
		
		//��ũ�ϱ�
		buffer.mark();
		System.out.println("----------[���� ��ġ�� ��ũ �س���]");	
		
		//����� �б�
		buffer.get(new byte[2]);
		System.out.println("[2����Ʈ�� ���� ��]");
		printState(buffer);									//position:5, limit: 5, capacity:7
		
		//��ũ ��ġ�� position �̵�
		buffer.reset();
		System.out.println("----------[position�� ��ũ ��ġ�� �ű�]");
		printState(buffer);									//position:3, limit: 5, capacity:7
		
		//position�� 0���� �̵�
		buffer.rewind();
		System.out.println("[rewind() ���� ��]");
		printState(buffer);									//position:0, limit: 5, capacity:7
		
		//��� ��ġ �Ӽ����� �ʱ�ȭ
		buffer.clear();
		System.out.println("[clear() ���� ��]");
		printState(buffer);									//position:0, limit: 7, capacity:7
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\tposition:" + buffer.position() + ", ");
		System.out.print("\tlimit:" + buffer.limit() + ", ");
		System.out.println("\tcapacity:" + buffer.capacity());
	}

}