
//201126
//Board만들기
//인터페이스

package com.yedam.Board;

import java.util.List;

public interface BoardService {
	
	public List getBoardList(); //리스트 조회. List 임포트 하기! / 리스트
	public BoardVO getBoard(int boardNo); //한건만 조회 / 상세화면
	public void insertBoard(BoardVO boardVO); //등록
	public void updateBoard(BoardVO boardVO); //수정
	public void deleteBoard(int boardNo); //삭제
	

}
