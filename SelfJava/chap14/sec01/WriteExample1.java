package chap14.sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp1/test2.db"); //������ �������� test2.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte[] array = {10, 20, 30};
		
		os.write(array);
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ���� ����
	}

}
