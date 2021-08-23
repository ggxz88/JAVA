package chap16.section03;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("����", Member.FEMALE, 20),
			new Member("�ڹڹ�", Member.MALE, 45),
			new Member("������", Member.FEMALE, 27)
		);
		
		double ageAvg = list.stream()
			.filter(m -> m.getSex() == Member.MALE)
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		System.out.println("���� ��� ����: " + ageAvg);
	}

}
