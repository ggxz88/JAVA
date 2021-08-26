package chap16.section11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> totalList = Arrays.asList(
			new Student("ȫ�浿", 10, Student.Sex.MALE),
			new Student("����", 6, Student.Sex.FEMALE),
			new Student("������", 10, Student.Sex.MALE),
			new Student("�ڹڹ�", 6, Student.Sex.FEMALE)
		);
		
		//���л��鸸 ���� List ����
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//���л��鸸 ���� HashSet ����
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
