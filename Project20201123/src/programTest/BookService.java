
//201126
//자바 시험 문제 7
//김찬곤


package programTest;

import java.util.List;

public interface BookService { //인터페이스
	
	public List showBookInfo(); //전체목록
	public void insertBook(BookVO bookVO); //등록
	public void updateBook(BookVO bookVO); //수정
	public void deleteBook(String bookAuthor); //저자 이름 넣으면 삭제

}
