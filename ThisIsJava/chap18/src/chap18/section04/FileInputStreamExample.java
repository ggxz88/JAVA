package chap18.section04;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream(
				"D:/Dev/ThisIsJava/chap18/src/chap18/section04/FileInputStreamExample.java"	
			);
			
			int data;
			while ( (data = fis.read() ) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
