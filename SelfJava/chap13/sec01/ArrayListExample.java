package chap13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		//String °´Ã¼¸¦ ¾ò±â
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//ÀúÀåµÈÃÑ °´Ã¼ ¼ö ¾ò±â
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println();
		
		//2¹ø ÀÎµ¦½ºÀÇ °´Ã¼ ¾ò±â
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		//2¹ø ÀÎµ¦½º °´Ã¼(Database) »èÁ¦µÊ
		list.remove(2);
		//2¹ø ÀÎµ¦½º °´Ã¼(Servlet/JSP) »èÁ¦µÊ
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}	
	}
}
