package com.dinfree.java.part1;

public class Gun {
	
	protected String model;//protected : 자기 자신과 자신으로부터 파생된 클래스까지만 접근 가능
	protected int bulletCount;
	
	public void fire() {
		System.out.println(model + "=>");
		bulletCount -= 1;
	}
	
	public Gun(String model) {
		bulletCount = 10;
		this.model = model;
	}

}
