package chap07.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		//자동 타입 변환 및 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();
		//자동 타입 변환 및 재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog()); //자동 타입 변환
		animalSound(new Cat()); //자동 타입 변환
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
