package chap14.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp1/test3.db"); //������ �������� test3.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ���� ����
	}

}
