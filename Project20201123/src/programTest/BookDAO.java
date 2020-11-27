
//201126
//자바 시험 문제 7
//김찬곤

package programTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BookDAO { //연결

	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 리스트
	public List showBookinfo() {
		conn = DAO.getConnection();
		sql = "select * from book";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookNo(rs.getInt("book_no"));
				vo.setTitle(rs.getString("title"));
				vo.setGenre(rs.getString("genre"));
				vo.setAuthor(rs.getString("author"));
				vo.setregist(rs.getString("regist"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 등록
	public void insertBook(BookVO bookVO) {
		conn = DAO.getConnection();
		sql = "insert into book(book_no, title, genre, author, regist)" + "values(?,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookVO.getBookNo());
			pstmt.setString(2, bookVO.getTitle());
			pstmt.setString(3, bookVO.getGenre());
			pstmt.setString(4, bookVO.getAuthor());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//수정
	public void updateBook(BookVO bookVO) {
		conn = DAO.getConnection();
		sql = "update book set title = ? where author = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookVO.getTitle());
			pstmt.setString(2, bookVO.getAuthor());
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//삭제
	public void deleteBook(int bookNo) {
		conn = DAO.getConnection();
		sql = "delete from book where book_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookNo);
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
