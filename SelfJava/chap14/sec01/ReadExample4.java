package chap14.sec01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/Temp1/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read();
			if(readCharNum == -1) break;
			for(int i = 0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
