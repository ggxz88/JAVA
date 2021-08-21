package chap15.example;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("title1", "content1"));
		list.add(new Board("title2", "content2"));
		list.add(new Board("title3", "content3"));

		return list;
	}
	
}
