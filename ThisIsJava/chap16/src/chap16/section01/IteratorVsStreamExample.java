package chap16.section01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println();
		}
		
		System.out.println();
		
		//Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
