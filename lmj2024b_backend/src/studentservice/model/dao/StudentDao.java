package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import studentservice.model.dto.StudentDto;

public class StudentDao {
	
	private Connection conn; // DB와 연동 결과를 조작하는 인터페이스
		private String dburl = "jdbc:mysql://localhost:3306/studentservice"; // 연동할 DB URL
		private String dbuser = "root";	// 연동할 DB 계정명
		private String dbpwd = "1234"; // 연동할 DB 비밀번호

	// + 싱글톤
	private static StudentDao instance = new StudentDao();
	private StudentDao() {
		try {
			// JDBC 클래스 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl , dbuser , dbpwd );
			System.out.println("[DB 연동 성공]");
		}catch( Exception e ) { System.out.println("[DB 연동 실패]" + e ); }
	} // f end
	public static StudentDao getinstance() { return instance; }
	// - 싱글톤
	
	// 1. 점수등록 SQL 처리 메소드
	public boolean register( StudentDto studentDto ) {
		try {
			// SQL 작성
			String sql = "insert into student( sname , kscore , escore , mscore )"
					+ "values( '"+studentDto.getSname()+"' , '"+studentDto.getKscore()+"' , '"
					+studentDto.getEscore()+"' , '"+studentDto.getMscore()+"' )";
			// DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// 기재된 SQL 실행 후 결과 받기
			int count = ps.executeUpdate();
			// 결과에 따른 처리 및 반환
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println( e ); }
		return false;			
	} // f end
	
	// 2. 점수조회 SQL 처리 메소드
	public ArrayList<StudentDto> check(){
		// 조회된 레코드(=StudentDto) 한개씩 저장하여 여러개 레코드(=StudentDto) 를 저정하는 리스트 객체
		ArrayList<StudentDto> list = new ArrayList<>();
		try {
		// SQL 작성
		String sql = "select * from student";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while( rs.next() ) {
			// 현재 레코드의 각 속성별 값 반환하기
			int sno = rs.getInt("sno");
			String sname = rs.getString("sname");
			int kscore = rs.getInt("kscore");
			int escore = rs.getInt("escore");
			int mscore = rs.getInt("mscore");
			// 반환 속성값들을 객체로 만들기
			StudentDto studentDto = new StudentDto(sno , sname , kscore , escore , mscore);
			list.add(studentDto);
		}
		}catch( SQLException e ) { System.out.println( e ); }
		return list; // 생성된 arraylist 객체 반환
	} // f end
	
	// 3. 점수삭제 SQL 처리 메소드
	public boolean delete( int sno ) {
		try {
			// SQL 작성
			String sql = "delete from student where sno = ?";
			// DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// 기재된 SQL에 매개변수 값 대입
			ps.setInt( 1 , sno );
			// SQL 실행 및 결과 반환
			int count = ps.executeUpdate();
			// 결과에 따른 처리 및 반환
			if( count == 1 ) { return true; } // 성공 시 true 반환
		}catch( SQLException e ) { System.out.println( e ); } 
		return false; // 실패 시 false 반환
	} //f end
	
	// 4. 학생번호조회 SQL 처리 메소드
	public int snoCheck( int sno ) {
		try {
			// SQL 작성
			String sql = "select * from student where sno = ?";
			// DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// 기재된 SQL에 매개변수 값 대입
			ps.setInt( 1 , sno );
			ResultSet rs = ps.executeQuery();
			if ( rs.next() ) {
				int findSno = rs.getInt("sno");
				return findSno;
			}
		}catch( SQLException e ) { System.out.println( e ); }
		return 0;
	} //f end
	
	// 5. 점수수정 SQL 처리 메소드
	public boolean update( StudentDto studentDto ) {
		try {
			// SQL 작성
			String sql = "update student set kscore = ? , escore = ? , mscore = ? where sno = ?";
			// DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// 기재된 SQL에 매개변수 값 대입
			ps.setInt( 1 , studentDto.getKscore() );
			ps.setInt( 2 , studentDto.getEscore() );
			ps.setInt( 3 , studentDto.getMscore() );
			ps.setInt( 4 , studentDto.getSno() );
			// 기재된 SQL를 실행하고 결과를 받기
			int count = ps.executeUpdate();
			// 결과에 따른 처리 및 반환
			if( count == 1 ) { return true; } // 수정 성공 시 true 반환
		}catch( SQLException e ) { System.out.println( e ); }
		return false; // 수정 실패 시 false 반환
	} // f end
	
} // c end













