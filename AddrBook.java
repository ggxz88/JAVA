package com.dinfree.java.part1;

import java.io.*;

public class AddrBook {

	public static void main(String[] args) throws IOException {
		File rfile = new File("addrbook.csv");
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(rfile));
			
			String s;
		
			while((s=reader.readLine()) != null) {
				s = s.replace(",", "|");
				System.out.println(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}
}

