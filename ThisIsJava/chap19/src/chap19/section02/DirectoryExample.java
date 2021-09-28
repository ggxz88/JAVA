package chap19.section02;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("C:/Temp/for/subdir");
		Path path2 = Paths.get("C:/Temp/file.txt");
		
		if (Files.notExists(path1)) {
			Files.createDirectories(path1);		//��� �� �������� �ʴ� ��� ���丮 ����
		}
		
		if (Files.notExists(path2)) {
			Files.createFile(path2);			// ���� ����
		}
		
		Path path3 = Paths.get("C:/Temp");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);	//���͸� ������ ��Ʈ��(�ݺ���)���� ����
		for (Path path : directoryStream) {
			if (Files.isDirectory(path)) {
				System.out.println("[���͸�] " + path.getFileName());
			} else {
				System.out.println("[����] " + path.getFileName() + "(ũ��:" + Files.size(path) + ")");
			}
		}
	}

}