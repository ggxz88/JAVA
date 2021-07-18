package chap11.section06;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());				// chap11.section06.Car
		System.out.println(clazz1.getSimpleName()); 		// Car
		System.out.println(clazz1.getPackage().getName()); 	// chap11.section06
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("chap11.section06.Car");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
