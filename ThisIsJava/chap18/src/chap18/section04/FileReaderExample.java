package chap18.section04;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(
			"D:/Dev/ThisIsJava/chap18/src/chap18/section04/FileReaderExample.java"
		);
		
		int readCharNo;
		char[ ] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
