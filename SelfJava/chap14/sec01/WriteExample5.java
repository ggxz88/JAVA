package chap14.sec01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp1/test9.txt"); //������ �������� test9.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 1, 3);
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		writer.close(); //��� ��Ʈ���� ����
	}

}
