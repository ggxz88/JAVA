package chap16.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
	static class Member {
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}
		
		public String getName() {
			return name;
		}
		
		public String getJob() {
			return job;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", "������"),
			new Member("�質��", "�����̳�"),
			new Member("�ſ��", "������")
		);
		
		List<Member> developers = list.stream()
				.filter(s -> s.getJob().equals("������"))
				.collect(Collectors.toList());
		
		developers.stream()
		.forEach(m -> System.out.println(m.getName()));
	}

}
