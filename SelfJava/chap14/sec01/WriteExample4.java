package chap14.sec01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp1/test8.txt"); //������ �������� test8.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		writer.close(); //��� ��Ʈ���� ����
	}

}
