package com.dinfree.java.part1;

public abstract class Robot {
	
	private String name;//멤버변수
	
	void move() {
		System.out.println("Robot moved !!");
	}
	
	abstract void charging();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
