package chap15.example;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student2> treeSet = new TreeSet<Student2>();
		treeSet.add(new Student2("blue", 96));
		treeSet.add(new Student2("hong", 86));
		treeSet.add(new Student2("white", 92));
		
		Student2 student = treeSet.last();
		System.out.println("�ְ� ����: " + student.score);
		System.out.println("�ְ� ������ ���� ���̵�: " + student.id);
	}

}
