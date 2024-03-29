package chap14.sec02;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp1/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp1/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
	}

}
