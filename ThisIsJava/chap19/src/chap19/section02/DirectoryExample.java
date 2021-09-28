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
			Files.createDirectories(path1);		//경로 상에 존재하지 않는 모든 디렉토리 생성
		}
		
		if (Files.notExists(path2)) {
			Files.createFile(path2);			// 파일 생성
		}
		
		Path path3 = Paths.get("C:/Temp");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);	//디렉터리 내용을 스트림(반복자)으로 얻음
		for (Path path : directoryStream) {
			if (Files.isDirectory(path)) {
				System.out.println("[디렉터리] " + path.getFileName());
			} else {
				System.out.println("[파일] " + path.getFileName() + "(크기:" + Files.size(path) + ")");
			}
		}
	}

}
