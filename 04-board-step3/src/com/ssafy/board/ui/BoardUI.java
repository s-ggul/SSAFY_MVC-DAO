package com.ssafy.board.ui;

import java.util.Scanner;

import com.ssafy.board.dto.Board;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.util.MyArrayList;

public class BoardUI {

	
	private Scanner sc;
	private BoardDao dao;
	public BoardUI() {
		dao = BoardDao.getInstance();
		sc = new Scanner(System.in);
	}
	public void service() {
		System.out.println("-----------------------");
		System.out.println("대전 8반 자유로운 게시판");
		System.out.println("-----------------------");
		while (true) {
			switch (menu()) {
			case 1: select(); break;
			case 2: break;
			case 3: insert(); break;
			case 4: break;
			case 5: break;
			case 0: exit(); break;
			default: 
				System.out.println("잘못된 메뉴번호 입니다.");
				System.out.println("다시 선택해 주세요");
			}
		}
	}
	
	private void exit() {
		System.out.println("게시판 관리 프로그램을 종료합니다.");
		System.exit(0);
	}
	
	private void select() {
		MyArrayList list = dao.select();
		int size = list.size();
		System.out.println("전체 : " + size);
		System.out.println("---------------------");
		System.out.println("번호\t제목\t작성자\t조회수");
		System.out.println("---------------------");
		for (int i = size - 1; i >= 0; i--) {
			Board b = (Board)list.get(i);
			System.out.printf(
				"%d\t%s\t%s\t%d%n", 
				b.getNo(), b.getTitle(), b.getWriter(), b.getViewCnt()
			);
		}
		System.out.println("---------------------");
	}
	
	private void insert() {
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("내용 입력 : ");
		String content = sc.nextLine();
		System.out.print("작성자 입력 : ");
		String writer = sc.nextLine();
		
		Board board = new Board();
		board.setContent(content);
		board.setTitle(title);
		board.setWriter(writer);
		
		dao.insert(board);
		
		System.out.println("게시글이 등록되었습니다.");
	}

	private int menu() {
		System.out.println("--------------------------");
		System.out.println("1. 전체 조회");
		System.out.println("2. 번호 조회");
		System.out.println("3. 등록");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("0. 종료");
		System.out.println("--------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}











