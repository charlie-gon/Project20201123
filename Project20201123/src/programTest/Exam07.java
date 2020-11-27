
//201126
//자바 시험 문제 7
//김찬곤

//oracle sqld에서 생성한 book 테이블 활용

package programTest;

import java.util.List;
import java.util.Scanner;

public class Exam07 { // Main class
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BookServiceImpl service = new BookServiceImpl();

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.전체목록 2.등록 3.수정 4.삭제 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				List list = service.showBookInfo();
				for (Object vo : list) {
					BookVO book = (BookVO) vo;
					book.showBookInfo();
				}

			} else if (selectNo == 2) {
				System.out.print("도서번호 입력: ");
				int bookNo = scn.nextInt();
				scn.nextLine();
				System.out.print("도서제목 입력: ");
				String title = scn.nextLine();
				System.out.print("장르 입력: ");
				String genre = scn.nextLine();
				System.out.print("저자 입력: ");
				String author = scn.nextLine();
				
				BookVO vo = new BookVO(bookNo, title, genre, author);
				BookDAO dao = new BookDAO();
				dao.insertBook(vo);
				

			} else if (selectNo == 3) {
				System.out.print("수정할 도서제목 입력: "); //새롭게 수정할 도서이름 입력
				scn.nextLine();
				String title = scn.nextLine();
				System.out.print("저자 입력: "); //해당 도서 저자 입력
				String author = scn.nextLine();
				
				BookVO vo = new BookVO(title, author);
				BookDAO dao = new BookDAO();
				dao.updateBook(vo);

			} else if (selectNo == 4) {
				System.out.print("삭제할 도서번호 입력: ");
				int bookNo = scn.nextInt();
				
				BookDAO dao = new BookDAO();
				dao.deleteBook(bookNo);

			} else if (selectNo == 5) {
				break;
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
	}// end of main

}// end of class
