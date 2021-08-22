package chap16.section01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
			"홍길동", "신용권", "김자바", "람다식", "임꺽정"	
		);
		
		//순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print); // = s -> ParallelExample.print(s)
		/*
		 * 홍길동 : main 
		 * 신용권 : main 
		 * 김자바 : main 
		 * 람다식 : main 
		 * 임꺽정 : main
		 */
		System.out.println();
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
		/*
		 * ForkJoinPool(스레드풀, 멀티 코어 대응 ExecutorService 구현)
		 * commonPool(정적 메소드, ForJoinPool을 따로 생성하지 않고 공통으로 사용하는 ForkJoinPool을 얻을 수 있음)
		 * 홍길동 : main 
		 * 신용권 : ForkJoinPool.commonPool-worker-2 
		 * 김자바 : ForkJoinPool.commonPool-worker-1 
		 * 람다식 : main 
		 * 임꺽정 : ForkJoinPool.commonPool-worker-2 
		 */
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
