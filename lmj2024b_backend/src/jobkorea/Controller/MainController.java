package jobkorea.Controller;

import jobkorea.model.dao.MainDao;
import jobkorea.model.dto.MemberDto;

public class MainController {
	
	// + 싱글톤
	private static MainController instance = new MainController();
	private MainController() {}
	public static MainController getinstance() { return instance; }
	// - 싱글톤
	
	// 2. 로그인 컨트롤러 메소드
	private int loginMno = 0;
	public int getLoginMno() { return loginMno; }
	
	public boolean login( MemberDto memberDto ) {
		int result = MainDao.getinstance().login( memberDto );
		if( result > 0 ) {
			loginMno = result;
			return true;
		}else {
			return false;
		} // if end
	} // f end
	
} // c end
