package chap14.sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp1/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		//OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� ���� ���
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		//FileInputStream�� InputStreamReader ���� ��Ʈ���� ����
		FileInputStream fis = new FileInputStream("C:/Temp1/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); //char�迭���� ���� ����ŭ ���ڿ��� ��ȯ
		return data;
	}

}
