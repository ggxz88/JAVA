package chap13.section06;

public class Person {
	public String person;
	
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Person(String person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	@Override
	public String toString() {
		return person;
	}

}
