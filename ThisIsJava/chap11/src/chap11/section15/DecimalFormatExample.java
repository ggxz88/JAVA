package chap11.section15;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));				//1234568
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(df));				//1234567.9
		
		df = new DecimalFormat("0000000000.00000");		
		System.out.println(df.format(df));				//0001234567.89000
		
		df = new DecimalFormat("#");
		System.out.println(df.format(df));				//1234568
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(df));				//1234567.9
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(df));				//1234567.89
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(df));				//1234567.9
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(df));				//+1234567.9
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(df));				//-1234567.9
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(df));				//1,234,567.9
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(df));				//1.2E6
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(df));				//+1,234,568
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(df));				//123456789 %
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(df));				//\ 1,234,568
	}

}
