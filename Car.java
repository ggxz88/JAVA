package com.dinfree.java.part1;

public class Car {
	
	private String color;//private:자기 자신만 접근가능
	private String model;
	private int power;
	private int curSpeed;
	
	public Car() {//public:모든 클래스가 이용가능
		curSpeed = 0;
	}
	
	public Car(String color, String model, int power) {
		this.color = color;//this : class Car의 color
		this.model = model;
		this.power = power;
	}
	
	public void go() {
		if (power < 200) {
			curSpeed += 10;
		} else if (power >= 200) {
			curSpeed +=20;
		}
		System.out.printf("Accelerate %s, Current Speed %d\n", model, curSpeed);
	}
	
	public void stop() {
		curSpeed = 0;
	}
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}

		public int getPower() {
			return power;
		}
		
		public void setPower(int power) {
			this.power = power;
		}
		
		public int getCurSpeed() {
			return curSpeed;
		}
		
		public void setCurSpeed(int curSpeed) {
			this.curSpeed = curSpeed;
		}
		
}
