package chap14.sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Temp1/test2.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2, 3); //�Է� ��Ʈ�����κ��� 3byte�� �а� buffer[2], buffer[3], buffer[4]�� ���� ����
		if(readByteNum != -1) { //���� ����Ʈ�� �ִٸ�
			for(int i = 0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
