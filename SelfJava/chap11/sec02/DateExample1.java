package chap11.sec02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
