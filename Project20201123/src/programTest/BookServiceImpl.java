
//201126
//자바 시험 문제 7
//김찬곤

package programTest;

import java.util.List;

public class BookServiceImpl implements BookService { //구현 클래스
	
	BookDAO dao = new BookDAO();

	@Override
	public List showBookInfo() { //전체목록
		return dao.showBookinfo();
	}

	@Override
	public void insertBook(BookVO bookVO) { //등록
		dao.insertBook(bookVO);
	}

	@Override
	public void updateBook(BookVO bookVO) { //수정
		dao.updateBook(bookVO);
	}

	@Override
	public void deleteBook(String bookAuthor) { //삭제
		
	} //구현 클래스
	
	

}
