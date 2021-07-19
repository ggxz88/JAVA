package chap11.section10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(01|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ");
		} else {
			System.out.println("���Խİ� ��ġ���� ����");
		}
		
		regExp = "\\w-@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ");
		} else {
			System.out.println("���Խİ� ��ġ���� ����");
		}
	}

}
