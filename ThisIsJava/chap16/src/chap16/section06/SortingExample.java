package chap16.section06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����� ���
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted()
			.forEach(n -> System.out.println(n + ", "));
		System.out.println();
		
		//��ü ����� ���
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 30),
			new Student("�ſ��", 10),
			new Student("�ڹڹ�", 20)
		);
		
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ", "));
		System.out.println();
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.print(s.getScore() + ", "));
	}

}
