package chap11.section11;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
