package com.yedam.board;

import java.util.List;

//인터페이스
public interface BoardService {
	public List getBoardList();//조회
	public BoardVO getBoard(int menu2);//한건조회
	public void insertBoard(BoardVO empVo);//등록
	public void deleteBoard(int menu4);//삭제
	public void updateBoard(BoardVO empVo);//수정

		
}
//main >> 인터페이스 >> lmpl >> DAO 