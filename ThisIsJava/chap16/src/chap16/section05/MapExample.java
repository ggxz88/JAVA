package chap16.section05;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("����", 20),
			new Student("�ڹڹ�", 30)
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}

}
