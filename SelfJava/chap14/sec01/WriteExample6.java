package chap14.sec01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp1/test10.txt"); //������ �������� test10.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		writer.close(); //��� ��Ʈ���� ����
	}

}
