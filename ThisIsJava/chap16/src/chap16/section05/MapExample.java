package chap16.section05;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
			new Student("È«±æµ¿", 10),
			new Student("±è±è±è", 20),
			new Student("¹Ú¹Ú¹Ú", 30)
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}

}
