package chap11.section03;

import java.util.Arrays;

public class Member3 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ����
		Member3 cloned = (Member3) super.clone();
		// scores ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car ���� ����
		cloned.car = new Car(this.car.model);
		// ���� ������ Member3 ��ü�� ����
		return cloned;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
