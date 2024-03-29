package chap19.section02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path path = Paths.get("src/chap19/section02/PathExample.java");
		System.out.println("[파일명] " + path.getFileName());						//PathExample.java
		System.out.println("[부모 디렉터리명]: " + path.getParent().getFileName());	//section02
		System.out.println("중첩 경로수: " + path.getNameCount());					//4
		
		System.out.println();
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));						//src chap19 section02 PathExample.java
		}
		
		System.out.println();
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println(temp.getFileName());						//src chap19 section02 PathExample.java
		}
	}

}
