package chap14.section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionalExample2 {
	private static List<Student> list = Arrays.asList(
		new Student("ȫ�浿", 90, 96),
		new Student("�ſ��", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {	// list�� ����� �׸� ����ŭ ����
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("���� ��� ����: " + mathAvg);
	}

}
