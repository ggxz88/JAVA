package chap14.sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Temp1/test2.db");
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read();
			if(readByteNum == -1) break;
			for(int i = 0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			
		}
		is.close();
	}

}
