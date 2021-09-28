package chap19.section02;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path path = Paths.get("src/chap19/section02/FileExample.java");
		System.out.println("���͸� ����: " + Files.isDirectory(path));
		System.out.println("���� ����: " + Files.isRegularFile(path));
		System.out.println("������ ���� �ð�: " + Files.getLastModifiedTime(path));
		System.out.println("���� ũ��: " + Files.size(path));
		System.out.println("������: " + Files.getOwner(path).getName());
		System.out.println("���� ���� ����: " + Files.isHidden(path));
		System.out.println("�б� ���� ����: " + Files.isReadable(path));
		System.out.println("���� ���� ����: " + Files.isWritable(path));
	}
	
}
