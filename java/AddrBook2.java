package com.dinfree.java.part1;

import java.io.*;
import java.nio.*;
import java.util.Scanner;

public class AddrBook2 {

	public static void main(String[] args) {
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("addrbook.csv"));
			scanner.useDelimiter(",");
			while(scanner.hasNext()) {//hasNext()메소드는 현재 위치에서 다음에 데이터가 있으면 true 없으면 false
				System.out.println(scanner.next());//next()메소드는 다음 데이터를 가져오는 메소드
			} 
			scanner.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
