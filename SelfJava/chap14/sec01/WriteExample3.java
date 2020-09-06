package chap14.sec01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp1/test7.txt"); //데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림을 생성
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력
		writer.close(); //출력 스트림을 닫음
	}

}
