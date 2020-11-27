
//201126
//자바 시험 문제 6
//김찬곤

package programTest;

public class Exam06 {

	// Field
	int bookNo; // 도서번호
	String title; //도서제목
	String genre; // 도서장르
	String author; // 저자
	String publish;// 출판일자

	// Constructor

	public Exam06() {
		super();
	}

	public Exam06(int bookNo, String title,String genre, String author, String publish) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.publish = publish;
	}

	//Method
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

	public String getpublish() {
		return publish;
	}

	public void setpublish(String publish) {
		this.publish = publish;
	}
	
	public void showBookInfo(int bookNo, String title, String genre, String author, String publish) {
		System.out.println("책번호: " + this.bookNo + "도서제목: " + this.title + "분야: " + this.genre + "저자: " + this.author + "출판일자: " + this.publish);
	}
	

}//end of class
