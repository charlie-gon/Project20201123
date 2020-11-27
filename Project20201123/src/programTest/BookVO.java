
//201126
//자바 시험 문제 7
//김찬곤

package programTest;

public class BookVO {

	// Field
	int bookNo; // 도서번호
	String title; // 도서제목
	String genre; // 도서장르
	String author; // 저자
	String regist;// 등록일자

	// Constructor

	public BookVO() {
			super();
		}

	public BookVO(int bookNo, String title,String genre, String author) {
			super();
			this.bookNo = bookNo;
			this.title = title;
			this.genre = genre;
			this.author = author;
		}
	

	public BookVO(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// Method
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getregist() {
		return regist;
	}

	public void setregist(String regist) {
		this.regist = regist;
	}

	public void showBookInfo() {
		System.out.println("책번호: " + this.bookNo + " 도서제목: " + this.title + " 분야: " + this.genre + " 저자: " + this.author
				+ " 출판일자: " + this.regist);
	}

}// end of class
