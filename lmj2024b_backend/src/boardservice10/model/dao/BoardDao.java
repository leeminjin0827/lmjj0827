package boardservice10.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.model.dto.BoardDto;

public class BoardDao extends Dao {
	
	// + 싱글톤
	private static BoardDao instance = new BoardDao();
	private BoardDao() {}
	public static BoardDao getinstance() { return instance; }
	// - 싱글톤
	
	// 1. 전체 게시물 SQL 처리 메소드
	public ArrayList<BoardDto> findAll(){
		// * 조회된 레코드(=BoardDto) 한개씩 저장하여 ㅇ러개 레코드(=BoardDto) 를 저장하는 리스트 객체
		ArrayList<BoardDto> list = new ArrayList<>();
		try {
			String sql = "select * from board";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ){
				// 레코드 : DB테이블의 가로/행 데이터
				// 조회된 결과 레코드1개 <--> 인스턴스(DTO) 1개 // 레코드 여러개 <--> [] 1개 또는 ArrayList 1개
				// 1. 현재 레코드의 각 속성별 값 반환하기
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				int bview = rs.getInt("bview");
				String bdate = rs.getString("bdate");
				int mno = rs.getInt("mno");
				int cno = rs.getInt("cno");
				// 2. 반환 속성값들을 dto(객체)로 만들기
				BoardDto boardDto = new BoardDto(bno , btitle , bcontent , bview , bdate , mno , cno );
				// 3. 생성된 dto(객체)를 리스트에 담기
				list.add(boardDto);
			} // w end
		}catch( SQLException e ) { System.out.println( e ); }
		return list; // 생성된 arraylist 객체 반환
	} // f end
	
} // c end
