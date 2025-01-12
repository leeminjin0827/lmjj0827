package studentservice.view;

import java.util.ArrayList;
import java.util.Scanner;

import studentservice.controller.StudentController;
import studentservice.model.dto.StudentDto;

public class StudentView {

	// + 싱글톤
	private static StudentView instance = new StudentView();
	private StudentView() {}
	public static StudentView getInstance() { return instance; }
	// - 싱글톤
	
	private Scanner scan = new Scanner(System.in);
	
	// 0. 메인 메뉴 메소드
	public void run() {
		while( true ) {
			System.out.println("1.점수등록|2.전체학생점수조회|3.점수삭제|4.점수수정|5.종료");
			int choose = scan.nextInt();
			if( choose == 1 ) { register(); }
			else if( choose == 2 ) { check(); }
			else if( choose == 3 ) { delete(); }
			else if( choose == 4 ) { snoCheck(); }
			else if( choose == 5 ) { System.out.println("[종료되었습니다.]"); break; }
		} // w end
	} // f end
	
	// 1. 점수등록 메소드
	public void register() {
		System.out.println("[점수등록]");		
		System.out.print("학생명 : ");	String sname = scan.next();
		System.out.print("국어점수 : ");	int kscore = scan.nextInt();
		System.out.print("영어점수 : ");	int escore = scan.nextInt();
		System.out.print("수학점수 : ");	int mscore = scan.nextInt();
		StudentDto studentDto = new StudentDto(sname , kscore , escore , mscore);
		boolean result = StudentController.getinstance().register( studentDto );
		if( result ) { System.out.println("[점수등록 성공]"); }
		else { System.out.println("[점수등록 실패"); }
	} // f end
	
	// 2. 점수조회 메소드
	public void check() {
		System.out.println("[점수조회]");
		// 컨트롤러 에게 요청하고 결과 받기
		ArrayList< StudentDto > result = StudentController.getinstance().check();
		// 결과에 따른 출력
		System.out.println("번호\t학생이름\t국어점수\t영어점수\t수학점수");
		for( int index = 0; index <= result.size()-1 ; index++ ) {
			StudentDto studentDto = result.get(index); // index번째의 요소 객체 꺼내기
			System.out.print( studentDto.getSno() + "\t" );
			System.out.print( studentDto.getSname() + "\t" );
			System.out.print( studentDto.getKscore() + "\t" );
			System.out.print( studentDto.getEscore() + "\t" );
			System.out.print( studentDto.getMscore() + "\n" );
		} // for end
	} // f end
	
	// 3. 점수삭제 메소드
	public void delete() {
		System.out.println("[점수삭제]");
		System.out.println("[학생번호를 입력하세요.]");
		System.out.print("학생번호 : ");	int sno = scan.nextInt();
		boolean result = StudentController.getinstance().delete( sno );
		if( result ) {
			System.out.println("[삭제 성공]");
		} // if end
		else {System.out.println("[삭제 실패]"); }
	} // f end
	
	// 4. 학생번호조회 메소드
	public void snoCheck() {
		System.out.println("[점수수정]");
		System.out.println("[학생번호를 입력하세요.]");
		System.out.print("학생번호 : ");	int sno = scan.nextInt();
		int result = StudentController.getinstance().snoCheck( sno );
		if( 0 < result ) { 
			System.out.print("국어점수 : ");	int kscore = scan.nextInt();
			System.out.print("영어점수 : ");	int escore = scan.nextInt();
			System.out.print("수학 점수 : ");	int mscore = scan.nextInt();
			StudentDto studentDto = new StudentDto( kscore , escore , mscore );
			boolean result1 = StudentController.getinstance().update( result , studentDto );
		} // if end
		else { System.out.println("[수정 실패]"); }
	} // f end
	
} // c end














