package studentservice;

import studentservice.view.StudentView;

public class AppStart {
	public static void main(String[] args) {
		
		System.out.println("[학생점수관리 서비스]");
		StudentView.getInstance().run();
		
	} // f end
} // c end
