package chap14.section06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("��õ��", "angel");
	}

}
