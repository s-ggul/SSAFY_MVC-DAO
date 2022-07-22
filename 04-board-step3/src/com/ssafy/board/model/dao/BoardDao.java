package com.ssafy.board.model.dao;

import com.ssafy.board.dto.Board;
import com.ssafy.board.util.MyArrayList;

public class BoardDao {

	private int seqNo = 0;
	private BoardDao() {}
	private MyArrayList list = new MyArrayList();
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	
//	private static BoardDao instance;
//	public synchronized static BoardDao getInstance() {
//		if (instance == null) {
//			instance = new BoardDao();
//		}
//		return instance;
//	}
	
	public void insert(Board board) {
		board.setNo(++seqNo);
		list.add(board);
	}

	public MyArrayList select() {
		return list;
	}
}



