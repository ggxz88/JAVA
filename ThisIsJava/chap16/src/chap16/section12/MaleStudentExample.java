package chap16.section12;

import java.util.Arrays;
import java.util.List;

import chap16.section11.MaleStudent;
import chap16.section11.Student;

public class MaleStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> totalList = Arrays.asList(
				new Student("È«±æµ¿", 10, Student.Sex.MALE),
				new Student("±è±è±è", 6, Student.Sex.FEMALE),
				new Student("ÀÌÀÌÀÌ", 10, Student.Sex.MALE),
				new Student("¹Ú¹Ú¹Ú", 6, Student.Sex.FEMALE)
			);
			
			MaleStudent maleStudent = totalList.parallelStream()
					.filter(s -> s.getSex() == Student.Sex.MALE)
					.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
			
			maleStudent.getList().stream()
				.forEach(s -> System.out.println(s.getName()));
	}

}
