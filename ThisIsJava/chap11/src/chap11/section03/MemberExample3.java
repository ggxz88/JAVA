package chap11.section03;

public class MemberExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member3 original = new Member3("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member3 cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		System.out.println("{");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.println(cloned.scores[i]);
		}
		System.out.println("}");
		System.out.println(cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println(original.name);
		System.out.println(original.age);
		System.out.println("{");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.println(original.scores[i]);
		}
		System.out.println("}");
		System.out.println(original.car.model);
		
	}

}
