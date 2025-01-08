package jobkorea.view;

import java.util.Scanner;

import jobkorea.Controller.MainController;
import jobkorea.model.dto.MemberDto;

public class MainView {
	// + 싱글톤
	private static MainView instance = new MainView();
	private MainView() {}
	public static MainView getinstance() { return instance; }
	// - 싱글톤
	Scanner scan = new Scanner( System.in );
	
	// 1 : 회원 로그인 / 회원가입 메소드 연동 -> 성공시 지원 / 후기 view 연동 
	// 2 : 기업 로그인 / 회원가입 메소드 연동 -> 성공 시 기업 view 연동 
	// 3 : 취업 연동
	
	   public void run() {
	      System.out.println("1.일반 2.기업");
	      int choose = scan.nextInt();
	      if( choose == 1 ) { 
	    	  System.out.println("1.일반 회원가입 2.일반 로그인 3.로그아웃");
	    	  int choose1 = scan.nextInt();
	    	  if( choose1 == 1 ) { mSignUp(); }
	    	  else if( choose1 == 2 ) { mLogin(); }
	    	  else if( choose1 == 3 ) { mLogout(); }
	      } // if end
	      else if( choose == 2 ) {
	    	  System.out.println("1.기업 회원가입 2.기업 로그인 3.로그아웃");
	    	  int choose1 = scan.nextInt();
	    	  if( choose1 == 1 ) { eSignUp(); }
	    	  else if( choose1 == 2 ) { eLogin(); }
	    	  else if( choose1 == 3 ) { eLogout(); }
	      } // if end 
	   } // v end
	   // [1] 회원 회원가입 메소드
	   public void mSignUp() {
	         
	   }
	   
	   // [2] 회원 로그인 메소드
	   public void mLogin() {
	         System.out.println("아이디 : ");		String mid = scan.next();
	         System.out.println("비밀번호 : ");	String mpwd = scan.next();
	         MemberDto memberDto = new MemberDto();
	         memberDto.setMid(mid);
	         memberDto.setMpwd(mpwd);
	         boolean result = MainController.getinstance().login(memberDto);
	         
	   }
	   
	   // [3] 회원 로그아웃 메소드
	   public void mLogout() {
	         
	   }
	   
	   // [1] 기업 회원가입 메소드
	   public void eSignUp() {
	         
	   }
	   
	   // [2] 기업 로그인 메소드
	   public void eLogin() {
	         
	   }
	   
	   // [3] 기업 로그아웃 메소드
	   public void eLogout() {
	         
	   }
	   
} // c end
