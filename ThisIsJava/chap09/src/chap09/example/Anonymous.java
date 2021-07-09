package chap09.example;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("달린다.");
		}
	};
			
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("또 달린다.");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
