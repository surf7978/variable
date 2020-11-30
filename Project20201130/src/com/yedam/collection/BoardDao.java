package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Board board = new Board(); //여기에 board선언해야 for문돌릴때마다 새로 생성됨
			board.setTitle("제목" + (i+1));
			board.setContent("내용" + (i+1));
			list.add(i, board);
		}
		return list;
	}

}
