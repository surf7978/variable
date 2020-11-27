package com.yedam.board;

import java.util.List;


//구현클래스
public class BoardServicelmpl implements BoardService {

	BoardDAO dao = new BoardDAO();
	
	@Override
	public List getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public BoardVO getBoard(int menu2) {
		return dao.getBoard(menu2);
	}

	@Override
	public void insertBoard(BoardVO vo) {
		dao.insertBoard(vo);
	}

	@Override
	public void deleteBoard(int menu4) {
		dao.deleteBoard(menu4);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		dao.updateBoard(vo);
	}

	
}
