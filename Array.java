package com.dinfree.java.part1;

import java.util.Arrays;//Arrays클릑하면 나옴
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		System.out.println("# 1. 배열 선언과 초기화");
		int[] scores = { 95, 100, 87, 91 };
		scores[2] = 90; // 3번째 90으로 정정
		
		System.out.println(scores);//object 아이디가 출력
		for(int s : scores) {
			System.out.println(s);
		}
		
		
		System.out.println("# 2. Arrays 메서드");
		System.out.println(Arrays.toString(scores));
		String[] cars = { "hyundai", "bmw", "benz", "toyota" };
		
		List<String> car_list = Arrays.asList(cars);
		System.out.println(car_list);
		System.out.println(car_list.get(1));
		
		System.out.println("# 3. Arrays 메서드: 정렬");
		Arrays.sort(cars);
		System.out.println(car_list);//cars출력 x
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, Collections.reverseOrder());
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, 0, 2);
		System.out.println(Arrays.asList(cars));
	
		System.out.println("# 4. 다차원 배열");
		int[][][] allScores = {
				{
			        {90,85,70,55,60},
			        {96,88,81,91,75},
			        {96,88,81,91,75},
			        {96,88,81,91,75}
			    },
			    {
			        {91,82,73,54,65},
			        {96,87,88,99,80},
			        {91,82,83,94,75},
			        {96,87,88,99,70}
			    },
			    {
			        {92,83,74,55,66},
			        {97,88,89,90,71},
			        {92,83,84,95,76},
			        {97,88,89,90,71}
			    }
		};
		System.out.println(allScores[1][2][0]); //91 출력

	}

}
