package chap14.sec01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp1/test7.txt"); //������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		writer.close(); //��� ��Ʈ���� ����
	}

}
