package chap07.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//�޼ҵ��� ������
		animalSound(new Dog()); //�ڵ� Ÿ�� ��ȯ
		animalSound(new Cat()); //�ڵ� Ÿ�� ��ȯ
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
