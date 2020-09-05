package chap13.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java�� �� ���� �����
		set.add("iBATIS");
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü ��: " + size);
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { //��ü �� ��ŭ ����
			String element = iterator.next(); //1���� ��ü�� ������
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC"); //1���� ��ü ����
		set.remove("iBATIS"); //1���� ��ü ����
		
		System.out.println("�� ��ü��: " + set.size()); //����� ��ü �� ���
		
		iterator = set.iterator(); //�ݺ��� ���
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
		
		
		
		
	}

}
