package chap18.section05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// 역직렬화해서 복원된 필드 조사
public class SerializableReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);					//1
		System.out.println("field2.field1: " + v.field2.field1);	//2
		System.out.println("field3: " + v.field3);					//0
		System.out.println("field4: " + v.field4);					//0
	}

}
