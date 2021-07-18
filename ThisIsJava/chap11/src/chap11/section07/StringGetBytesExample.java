package chap11.section07;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);		//10
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);				//�ȳ��ϼ���
		
		try {
			byte[] bytes2 = str.getBytes("EUR-KR");
			System.out.println("bytes2.length: " + bytes2.length);	//10
			String str2 = new String(bytes2);
			System.out.println("bytes2->String: " + str2);			//�ȳ��ϼ���
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);	//15
			String str3 = new String(bytes3);
			System.out.println("bytes3->String: " + str3);			//�ȳ��ϼ���
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
