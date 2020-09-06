package chap14.sec01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp1/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for(int i = 0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		
		reader.close();
	}

}
