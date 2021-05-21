package com.dinfree.java.part1;

public class MethodsPrac {

	void printInfo(String major, String name, int schoolid) {
		System.out.printf("#학과 : %s\n", major);
		System.out.printf("#학번 : %s\n", schoolid);
		System.out.printf("#이름 : %s\n", name);
	}
	
	public static void main(String[] args) {
		MethodsPrac p = new MethodsPrac();
		p.printInfo("동양어문학과", "박희선", 201531539);
	}

}
