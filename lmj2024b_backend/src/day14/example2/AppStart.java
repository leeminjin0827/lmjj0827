package day14.example2;

import day14.example2.view.ClassView;

/*	
과제 주제 : 자유 주제로 CRUD 프로그램 구현 하기
[ 조건 ]
	1. MVC 디자인 패턴 사용   ( 로그인상태는 controller )
	2. 싱글톤 디자인 패턴 사용
	3. ArrayList 클래스 사용
	4. C(저장)R(출력)U(수정)D(삭제)
[ 순서 ]
	https://app.diagrams.net/
	1. 선정한 주제에 따른 FLOW CHART 그리기
	2. 선정한 주제에 따른 클래스 다이어그램 작성하기 , 함수의 매개변수/반환타입 , +public -private
[ 구현 순서 ]
	1. 패키지 구성
	2. 클래스 만들기 , 클래스 내부 추후에
	3. DTO클래스 먼저 코드 구현하기
	4. 싱글톤 패턴을 사용할 클래스들에 싱글톤 코드 작성
	5. 함수 각 구현 , 기능별 VIEW -> CONTROLLER -> DAO 순서대로 구현
*/
public class AppStart {
	public static void main(String[] args) {
		
		// + 싱글톤의 내부 함수 호출
		ClassView.getInstance().run();
		
	} // m end
} // c end
