package chap15.example;

public class Student2 implements Comparable<Student2> {
	public String id;
	public int score;
	
	public Student2(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student2 obj) {
		if (score < obj.score) {
			return -1;
		} else if (score == obj.score) {
			return 0;
		} else {
			return 1;
		}
	}
}
