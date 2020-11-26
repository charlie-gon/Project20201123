
//201126
//Board만들기
//VO클래스
//데이터 요청 시 VO에서 데이터 정제하여 DAO로 요청
package com.yedam.Board;

public class BoardVO {

	// field
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String date;

	// constructor
	public BoardVO(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public BoardVO(String writer) {
		super();
		this.writer = writer;
	}

	public BoardVO() {

	}

	// method
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void getBoardList() {
		System.out.println("글번호: " + this.boardNo + " 제목: " + this.title + " 작성자: " + this.writer + " 글내용: "
				+ this.content + "작성일자: " + this.date);
	}

}
