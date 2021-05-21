package com.dinfree.java.part1;

public class AssaultRifle extends Gun {
	
	public void fire() {
		bulletCount -= 5;
		System.out.printf("%s => => => => => , %d\n", model, bulletCount);
	}

	public AssaultRifle(String model) {
		super(model); //생성자에서 슈퍼클래스의 생성자를 호출
		bulletCount = 40;
 	}

}
