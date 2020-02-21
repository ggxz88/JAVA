package com.dinfree.java.part1;

public class Multiplication_table {

	public static void main(String[] args) {
		System.out.println("# 201531539 동양어문학과 박희선 - 구구단");
		for(int i = 2; i <= 9; i++) {
			System.out.printf("# %d단\n", i);
			for(int k = 1; k <= 9; k++) {
				System.out.printf("%d * %d = %d\n", i, k, i*k);
			}
			System.out.println();
		}
	}

}
