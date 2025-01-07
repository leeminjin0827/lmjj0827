// 한줄 주석
/* 여러줄 주석 */

/*
	----------------------------------------------------------------------
	1. .java 파일이란? 자바 코드를 작성할수 있는 확장자명(데이터를 사용하는 방법 정의)
	2. .class 파일이란? 자바가 .java 파일을 컴파일(번역)해서 만든 파일
		- 워크스페이스내 프로젝트내 bin 폴더내 컴파일(번역)된 .class 파일 생성
		- 개발자가( .java 파일 에서 class 문법 작성 ) ----> 컴파일 ----> .class 파일 생성
	3. main 함수이란? 스레드가 내장된 함수
	 - 스레드란? 번역된 코드를 읽어드리기 위한 실행 흐름
	----------------------------------------------------------------------
	예] 한국인(한국어) 일본인(일본어)
	- 한국인이 일본인에게 편지 쓴다.
	1. 한국인(개발자)가 한국어로(자바언어) 편지 지(규격-.java) 작성
	2. 편지 번역하기( 컴파일 과정 .java[자바코드] --> .class[바이트파일] )
	3. 편지 읽고 실행 ( 스레드 과정 - 번역된 코드를 읽는 흐름단위 )
	
 */

package day02; // 현재 클래스가 위치한 패키지/폴더 명

//무조건 자바는 클래스 { } 안에서 코드를 작성해야지 컴파일(번역)한다.
public class Example1 { // 클래스의 시작 // 컴파일이 번역하는 단위 // class 밖에 있는 코드는 번역 안됨.
	
	// 번역된 코드들을 읽어드리고 실행하는 코드는 무조건 main 함수{ } 안에서 작성해야 한다.
	public static void main(String[] args) { // main 함수 시작
		
		// 상수 : 초기화 이후 변하지 않는 값 ,  final 키워드 , 상수명은 대문자로 사용한다. // p.61
		final int MAX_NUM = 100;
		final int MIN_NUM ;
		MIN_NUM = 0;
		
		// MIN_NUM = 1000; // **상수는 수정이 불가능**
		
		// + 출력함수 JS:console.log() JAVA : System.out.pointln();
		// 자동안성 , syso 입력후 컨트롤+스페이스바 , +(연결연산자) : "문자열"+변수명
		System.out.println("MAX_NUM : " + MAX_NUM);
		System.out.println("MIN_NUM : " + MIN_NUM);
		
		// + 자바코드 실행 , main 함수가 존재하는 class 에서 ctrl+f11
		
		// 리터럴이란 ? 개발자가 키보드로부터 입력한 숫자,문자,논리 들을 일컫는 말
			// - 자바는 이러한 리터럴값들을 상수풀(메모리공간)이라는 곳에서 *상수*로 사용한다.
	} // main 함수 끝
} // 클래스의 끝
