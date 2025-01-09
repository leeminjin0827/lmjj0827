package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {
	
	// + 싱글톤
	private static BoardController instance = new BoardController();
	private BoardController () {}
	public static BoardController getinstance() { return instance; }
	// - 싱글톤
		
	// 1. 전체 게시물 컨트롤러 메소드
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> result = BoardDao.getinstance().findAll();
		return result;
	} // f end
	
} // c end
