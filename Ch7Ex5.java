package com.dinfree.java.part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Ch7Ex5 {

	public static void main(String[] args) {
		System.out.println("## 간단 메모장 v1.0 ##");
		System.out.print("## 저장할 파일명: ");
		Scanner scanner = new Scanner(System.in);//문자열 입력 받고 저장
		String filename = scanner.next();
		System.out.println("## 저장은 마지막 라인에 q 입력\n");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("e:/dev/"+filename));
			String s;
			while(!(s=reader.readLine()).equals("q")) {
				writer.write(s+"\r\n");
			}
			reader.close();
			writer.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("## 프로그램을 종료 합니다.");
		System.out.println(filename+" 저장되었습니다.!!");	
	}
}






