package chap14.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp1/test1.db"); //������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		//1byte�� ���
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ���� ����
	}

}
