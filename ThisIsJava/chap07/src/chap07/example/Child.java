package chap07.example;

public class Child extends Parent {
	public String name;

	public Child() {
		this("¥Î«—πŒ±π");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
