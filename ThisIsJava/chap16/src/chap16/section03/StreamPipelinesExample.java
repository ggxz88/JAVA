package chap16.section03;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
			new Member("È«±æµ¿", Member.MALE, 30),
			new Member("±è±è±è", Member.FEMALE, 20),
			new Member("¹Ú¹Ú¹Ú", Member.MALE, 45),
			new Member("ÀÌÀÌÀÌ", Member.FEMALE, 27)
		);
		
		double ageAvg = list.stream()
			.filter(m -> m.getSex() == Member.MALE)
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		System.out.println("³²ÀÚ Æò±Õ ³ªÀÌ: " + ageAvg);
	}

}
