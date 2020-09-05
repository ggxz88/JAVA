package chap13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		//String ��ü�� ���
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//������� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();
		
		//2�� �ε����� ��ü ���
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//����� �� ��ü ����ŭ ����
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		//2�� �ε��� ��ü(Database) ������
		list.remove(2);
		//2�� �ε��� ��ü(Servlet/JSP) ������
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}	
	}
}
