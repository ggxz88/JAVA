package chap19.section03;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[7바이트 크기로 버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);		
		
		printState(buffer);									//position:0, limit: 7, capacity:7
		
		//상대적 저장
		buffer.put((byte)10);
		buffer.put((byte)11);
		System.out.println("[2바이트 저장후]");
		printState(buffer);									//position:2, limit: 7, capacity:7
		
		//상대적 저장
		buffer.put((byte)12);
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3바이트 저장후]");
		printState(buffer);									//position:5, limit: 7, capacity:7
		
		//데이터를 읽기 위애 위치 속성값 변경
		buffer.flip();
		System.out.println("[flip() 살행 후]");
		printState(buffer);									//position:0, limit: 5, capacity:7
		
		//상대적 읽기
		buffer.get(new byte[3]);
		System.out.println("[3바이트를 읽은 후]");
		printState(buffer);									//position:3, limit: 5, capacity:7
		
		//마크하기
		buffer.mark();
		System.out.println("----------[현재 위치를 마크 해놓음]");	
		
		//상대적 읽기
		buffer.get(new byte[2]);
		System.out.println("[2바이트를 읽은 후]");
		printState(buffer);									//position:5, limit: 5, capacity:7
		
		//마크 위치로 position 이동
		buffer.reset();
		System.out.println("----------[position을 마크 위치로 옮김]");
		printState(buffer);									//position:3, limit: 5, capacity:7
		
		//position을 0으로 이동
		buffer.rewind();
		System.out.println("[rewind() 살행 후]");
		printState(buffer);									//position:0, limit: 5, capacity:7
		
		//모든 위치 속성값을 초기화
		buffer.clear();
		System.out.println("[clear() 살행 후]");
		printState(buffer);									//position:0, limit: 7, capacity:7
	}
	
	public static void printState(Buffer buffer) {
		System.out.print("\tposition:" + buffer.position() + ", ");
		System.out.print("\tlimit:" + buffer.limit() + ", ");
		System.out.println("\tcapacity:" + buffer.capacity());
	}

}
