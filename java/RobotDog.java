package com.dinfree.java.part1;

public class RobotDog extends Robot implements Pet {
	
	@Override //Override 를 표시하기 위함
	public void bark() {
		System.out.println("Woof Woof~~");
	}
	
	@Override
	void charging() {
		System.out.println(getName() + " go to charginf station");
	}

	public static void main(String[] args) {
		
		RobotDog rd = new RobotDog();
		rd.setName("robo dog");
		rd.bark();
		rd.move();
		rd.charging();

	}

}
