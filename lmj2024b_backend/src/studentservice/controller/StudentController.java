package studentservice.controller;

import java.util.ArrayList;

import studentservice.model.dao.StudentDao;
import studentservice.model.dto.StudentDto;

public class StudentController {
	
	// + 싱글톤
	private static StudentController instance = new StudentController();
	private StudentController() {}
	public static StudentController getinstance() { return instance; }
	// - 싱글톤
	
	// 1. 점수등록 컨트롤러 메소드
	public boolean register( StudentDto studentDto ) {
		boolean result = StudentDao.getinstance().register( studentDto );
		return result;
	} //f end
	
	// 2. 점수조회 컨트롤러 메소드
	public ArrayList<StudentDto> check() {
		ArrayList<StudentDto> result = StudentDao.getinstance().check();
		return result;
	} // f end
	
	// 3. 점수삭제 컨트롤러 메소드
	public boolean delete( int sno ) {
		boolean result = StudentDao.getinstance().delete( sno );
		return result;
	} // f end
	
	// 4. 학생번호조회 컨트롤러 메소드
	public int snoCheck( int sno ) {
		int result = StudentDao.getinstance().snoCheck( sno );
		return result;
	} // f end
	
	// 5. 점수수정 컨트롤러 메소드
	public boolean update( int result , StudentDto studentDto ) {
		studentDto.setSno(result);
		boolean result1 = StudentDao.getinstance().update( studentDto );
		return result1;
	} //f end
	
	
} // c end














