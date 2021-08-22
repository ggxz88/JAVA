package chap16.section01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
			"ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�Ӳ���"	
		);
		
		//���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print); // = s -> ParallelExample.print(s)
		/*
		 * ȫ�浿 : main 
		 * �ſ�� : main 
		 * ���ڹ� : main 
		 * ���ٽ� : main 
		 * �Ӳ��� : main
		 */
		System.out.println();
		
		//���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
		/*
		 * ForkJoinPool(������Ǯ, ��Ƽ �ھ� ���� ExecutorService ����)
		 * commonPool(���� �޼ҵ�, ForJoinPool�� ���� �������� �ʰ� �������� ����ϴ� ForkJoinPool�� ���� �� ����)
		 * ȫ�浿 : main 
		 * �ſ�� : ForkJoinPool.commonPool-worker-2 
		 * ���ڹ� : ForkJoinPool.commonPool-worker-1 
		 * ���ٽ� : main 
		 * �Ӳ��� : ForkJoinPool.commonPool-worker-2 
		 */
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
