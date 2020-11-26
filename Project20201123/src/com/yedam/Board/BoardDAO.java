
//201126
//Board만들기
//DAO클래스

package com.yedam.Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {
	
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//리스트
	public List getBoardList() {
		conn = DAO.getConnection();
		sql = "select * from board";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setDate(rs.getString(5));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//상세화면
	public BoardVO getBoard(int boardNo) {
		conn = DAO.getConnection();
		sql = "select * from board where board_no = ?";
		
		BoardVO vo = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setDate(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	//등록
	public void insertBoard(BoardVO boardVO) {
		conn = DAO.getConnection();
		sql = "insert into board(board_no, title, content, writer, creation_date)" + "values(?,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardVO.getBoardNo());
			pstmt.setString(2, boardVO.getTitle());
			pstmt.setString(3, boardVO.getContent());
			pstmt.setString(4, boardVO.getWriter());
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//삭제
	public void deleteBoard(int boardNo) {
		conn = DAO.getConnection();
		sql = "delete from board where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//수정
	public void updateBoard(BoardVO boardVO) {
		conn = DAO.getConnection();
		sql = "update board set title = ? where board_no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
