package chap18.section05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
	}

}