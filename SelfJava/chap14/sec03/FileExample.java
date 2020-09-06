package chap14.sec03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:/Temp1/images");
		File file1 = new File("C:/Temp1/file1.txt");
		File file2 = new File("C:/Temp1/file2.txt");
		File file3 = new File("C:/Temp1/file2.txt");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		File temp = new File("C:/Temp1");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
