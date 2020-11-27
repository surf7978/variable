package test;

public class Exam06 {
	
	int bookNo;
	String title;
	String content;
	String writer;
	String creation_date;
	
	public Exam06() {
		
	}
	
	
	public Exam06(int bookNo, String title, String content, String writer, String creation_date) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creation_date = creation_date;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	

	
}
