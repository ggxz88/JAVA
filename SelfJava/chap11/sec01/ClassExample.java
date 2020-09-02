package chap11.sec01;

import chap07.sec01.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//첫 번째 방법
		Class clazz = Car.class;
		
		//두 번째 방법
		//Class clazz = Class.forName("sec01.exam.Car");
		
		//세 번째 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
