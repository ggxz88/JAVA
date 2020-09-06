package chap14.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp1/test2.db"); //데이터 도착지를 test2.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
		byte[] array = {10, 20, 30};
		
		os.write(array);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); //출력 스트림을 닫음
	}

}
