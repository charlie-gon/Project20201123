
//201126
//실행클래스

package com.yedam.Board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// BoardServiceImpl값을 -> BoardService로 전달하기 위한 인스턴스 생성
		BoardService service = new BoardServiceImpl();

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.리스트 2.상세화면 3.등록 4.삭제 5.수정 6.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				List list = service.getBoardList(); // BoardServiceImpl의 getBoardList 소환
				for (Object vo : list) {
					BoardVO board = (BoardVO) vo;
					board.getBoardList();
				}

			} else if (selectNo == 2) {
				System.out.println("조회할 글번호 입력");
				int boardNo = scn.nextInt();
				BoardVO vo = service.getBoard(boardNo);
				vo.getBoardList();

			} else if (selectNo == 3) {
				System.out.print("글번호 입력: ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("제목 입력: ");
				String title = scn.nextLine();
				System.out.print("작성자 입력: ");
				String writer = scn.nextLine();
				System.out.print("글내용: ");
				String content = scn.nextLine();

				BoardVO vo = new BoardVO(boardNo, title, content, writer);
				BoardDAO dao = new BoardDAO();
				dao.insertBoard(vo);

			} else if (selectNo == 4) {
				System.out.println("삭제할 글번호를 입력하세요: ");
				int boardNo = scn.nextInt();

				BoardDAO dao = new BoardDAO();
				dao.deleteBoard(boardNo);
				// 입력한 글 제목의 내용을 변경
			} else if (selectNo == 5) {
				System.out.print("수정할 제목을 입력하세요: ");
				scn.nextLine();
				String title = scn.nextLine();
				System.out.print("글번호 입력: ");
				int boardNo = scn.nextInt();

				BoardVO vo = new BoardVO(title, boardNo);
				BoardDAO dao = new BoardDAO();
				dao.updateBoard(vo);

			} else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}// end of class

}// end of main
