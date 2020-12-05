package com.yedam.board;

import java.util.List;

//VO클래스
public class BoardVO implements BoardService {
	int boardNo;
	String title;
	String content;
	String writer;
	String creation_date;
	
	public BoardVO() {
		
	}
	
	public BoardVO(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;

	}
	
	public BoardVO(int boardNo, String title, String content, String writer, String creation_date) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creation_date = creation_date;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
	
	public void showInfo() {
		System.out.println("번호: " + boardNo + ", 제목: " + title + ", 내용: " + content
				+ ", 작성자: " + writer + ", 작성일: " + creation_date);
	}

	@Override
	public List getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getBoard(int menu2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(BoardVO empVo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int menu4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardVO empVo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
