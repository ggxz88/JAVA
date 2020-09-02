package chap11.sec01;

import java.io.IOException;

public class KeyBoardToStringExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];	//읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
