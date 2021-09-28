package chap16.example;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	
	static class Member {
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", 30),
			new Member("�ſ��", 40),
			new Member("���ڹ�", 26)	
		);
		
		double avg 
		= list.stream().mapToInt(Member :: getAge).average().getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}

}