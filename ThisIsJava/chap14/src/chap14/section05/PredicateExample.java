package chap14.section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student2> list = Arrays.asList(
		new Student2("ȫ�浿", "����", 90),
		new Student2("�����", "����", 90),
		new Student2("���ڹ�", "����", 95),
		new Student2("���ѳ�", "����", 92)
	);
	
	public static double avg(Predicate<Student2> predicate) {
		int count = 0, sum = 0;
		for (Student2 student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double maleAvg = avg(t -> t.getSex().contentEquals("����"));
		System.out.println("���� ��� ����: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().contentEquals("����"));
		System.out.println("���� ��� ����: " + femaleAvg); 
	}

}
