package com.ssafy.board.model.dao;

import java.util.Arrays;

import com.ssafy.board.dto.Board;

//dao => 데이터를 관리하는 영역 => 실습에서의 manager클래스들
//dao 는 저장을 대신해줘도 입력을 직접받지는 않는다.
// Singleton

public class BoardDao {
	private Board[] list = new Board[3];
	private int pos = 0;
	private int seqNo = 0;
	private BoardDao() {}
	

	private static BoardDao instance = new BoardDao();
	
	public static BoardDao getInstance() {
		return instance;
	}
	
	/*
	
	 public synchronized static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	 
	*/
	
	public void insert(Board b) {
		if(this.pos == this.list.length) {
			this.list = Arrays.copyOf(this.list, this.pos*2);
		}
		b.setNo(++seqNo);
		this.list[pos++] = b;
	}
	
	public Board[] getList() {
		return Arrays.copyOf(list, pos);
	}	
}
