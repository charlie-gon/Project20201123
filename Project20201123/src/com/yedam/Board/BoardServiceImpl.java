
//201126
//Board만들기
//구현클래스

package com.yedam.Board;

import java.util.List;

public class BoardServiceImpl implements BoardService{
	
	//BoardDAO가 가지고 있는 값을 호출하기 위한 인스턴스 생성
	BoardDAO dao = new BoardDAO();
	
	@Override
	public List getBoardList() { //리스트
		// TODO Auto-generated method stub
		return dao.getBoardList();
	}

	@Override
	public BoardVO getBoard(int boardNo) { //상세화면
		// TODO Auto-generated method stub
		return dao.getBoard(boardNo);
	}

	@Override
	public void insertBoard(BoardVO boardVO) { //등록
		// TODO Auto-generated method stub
		dao.insertBoard(boardVO);
	}

	@Override
	public void updateBoard(BoardVO boardVO) { //수정
		// TODO Auto-generated method stub
		dao.updateBoard(boardVO);
	}

	@Override
	public void deleteBoard(int boardNo) { //삭제
		// TODO Auto-generated method stub
		
	}

	
}
