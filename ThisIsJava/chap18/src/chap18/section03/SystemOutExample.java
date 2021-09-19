package chap18.section03;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = System.out;
		
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(10);
		
		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "�����ٶ󸶹ٻ糪����īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

}
